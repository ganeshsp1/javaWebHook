package hello;

import vo.ApiAiRQ;
import vo.OriginalRequest;
import vo.Result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){

        System.out.println(obj);
        obj=obj.replace("-", "");
        System.out.println(obj);
//        Gson gson = new Gson();
//        ApiAiRQ aiRQ= gson.fromJson(obj, ApiAiRQ.class);
        ApiAiRQ aiRQ = new ApiAiRQ();
        String url = "";
		try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
        aiRQ = mapper.readValue(obj, ApiAiRQ.class);
        Result result = aiRQ.getResult();
        url = result.getParameters().getUrl();
        } catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}	 catch (IOException e) {
			e.printStackTrace();
		}
        return new WebhookResponse("Hello_fromSystem! "+  aiRQ.getStatus(), url );        
    }
}
