package hello;

import main.java.vo.Data;
import main.java.vo.Google;
import main.java.vo.Items;
import main.java.vo.Rich_response;
import main.java.vo.Simple_response;


public class WebhookResponse {
    private final String speech;
    private final String displayText;
    private final String textToSpeech;

    private final String source = "java-webhook";
    private Data data;
    public WebhookResponse(String speech, String displayText) {
        this.speech = speech;
        this.displayText = displayText;
        this.textToSpeech = "texttoSpeech";
        this.data = new Data();
        Google google = new Google();
        google.setExpect_user_response("true");
        Rich_response rich_response = new Rich_response();
        Simple_response simple_response = new Simple_response();
        simple_response.setText_to_speech("This is a sample text");
        Items item = new Items();
        item.setSimple_response(simple_response);
        Items[] items = {item};
		rich_response.setItems(items );
		google.setRich_response(rich_response );
		data.setGoogle(google );
    }


    public Data getdata ()
    {
        return data;
    }
    public String getTextToSpeech() {
        return textToSpeech;
    }
    
    public String getSpeech() {
        return speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public String getSource() {
        return source;
    }
}

