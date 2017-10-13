package hello;

import main.java.vo.ApiAiRQ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){

        System.out.println(obj);
        obj=obj.replace("-", "");
        System.out.println(obj);
        Gson gson = new GsonBuilder().serializeNulls().create();        
        ApiAiRQ aiRQ= gson.fromJson(obj, ApiAiRQ.class);
        return new WebhookResponse("Hello_fromSystem! "+  aiRQ.getStatus(), "Test" );
    }
}
