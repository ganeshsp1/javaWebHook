package hello;

import main.java.vo.ApiAiRQ;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
@Controller
@RequestMapping("/webhook")
public class HelloWorldController {
	
	static class CollectionAdapter implements JsonSerializer<Collection<?>> {
		  @Override
		  public JsonElement serialize(Collection<?> src, Type typeOfSrc,
		    JsonSerializationContext context) {
		   if (src == null || src.isEmpty())
		    return null;

		   JsonArray array = new JsonArray();

		   for (Object child : src) {
		    JsonElement element = context.serialize(child);
		    array.add(element);
		   }

		   return array;
		  }
		 }
	

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){

        System.out.println(obj);
        obj=obj.replace("-", "");
        System.out.println(obj);
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(
        	    Collection.class, new CollectionAdapter()).create();       
        ApiAiRQ aiRQ= gson.fromJson(obj, ApiAiRQ.class);
        return new WebhookResponse("Hello_fromSystem! "+  aiRQ.getStatus(), "Test" );
    }
}
