package hello;

import main.java.vo.ApiAiRQ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

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
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
        aiRQ = mapper.readValue(obj, ApiAiRQ.class);
        
        } catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}	 catch (IOException e) {
			e.printStackTrace();
		}
        return new WebhookResponse("Hello_fromSystem! "+  aiRQ.getStatus(), "Test" );        
    }
}
