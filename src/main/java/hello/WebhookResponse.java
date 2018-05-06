package hello;

import vo.Data;
import vo.Google;
import vo.Image;
import vo.Items;
import vo.Messages;
import vo.OptionInfo;
import vo.Rich_response;
import vo.Simple_response;


public class WebhookResponse {
//    private final String speech;
//    private final String displayText;
//    private final String textToSpeech;
	 private String speech;

	    private String displayText;

	    private Messages[] messages;
    private final String source = "java-webhook";
    private Data data;
    public WebhookResponse(String speech, String displayText) {
//        this.speech = speech;
//        this.displayText = displayText;
//        this.textToSpeech = "texttoSpeech";
//        this.data = new Data();
//        Google google = new Google();
//        google.setExpect_user_response("true");
//        Rich_response rich_response = new Rich_response();
//        Simple_response simple_response = new Simple_response();
//        simple_response.setText_to_speech("This is a sample text");
//        Items item = new Items();
//        item.setSimple_response(simple_response);
//        Items[] items = {item};
//		rich_response.setItems(items );
//		google.setRich_response(rich_response );
//		data.setGoogle(google );.
    	setSpeech(speech);
    	setDisplayText(displayText);
    	
    	Messages message = new Messages();
    	Messages message1 = new Messages();
    	/*message.setType("simple_response");
    	message.setPlatform("google");
    	message.setTextToSpeech("Hi");
    	message1.setType("carousel_card");
    	message1.setPlatform("google");
    	Items item1 = new Items();
    	Image image = new Image();
    	image.setUrl("https://upload.wikimedia.org/wikipedia/commons/c/c8/Taj_Mahal_in_March_2004.jpg");
		item1.setImage(image);
    	OptionInfo optionInfo = new OptionInfo();
    	optionInfo.setKey("KEY");
		item1.setOptionInfo(optionInfo );
    	item1.setTitle("tajmahal 1");
		Items item2 = new Items();
    	image.setUrl("https://upload.wikimedia.org/wikipedia/commons/c/c8/Taj_Mahal_in_March_2004.jpg");
		item1.setImage(image);
    	OptionInfo optionInfo1 = new OptionInfo();
    	optionInfo1.setKey("KEY1");
		item1.setOptionInfo(optionInfo1 );
    	item1.setTitle("tajmahal 2");
		Items[] items = {item1,item2};
		message1.setItems(items );*/
    	
    	Messages[] messages = {message,message1};
		setMessages(messages);
    }



    public String getSpeech ()
    {
        return speech;
    }

    public void setSpeech (String speech)
    {
        this.speech = speech;
    }

    public String getSource ()
    {
        return source;
    }

    public String getDisplayText ()
    {
        return displayText;
    }

    public void setDisplayText (String displayText)
    {
        this.displayText = displayText;
    }

    public Messages[] getMessages ()
    {
        return messages;
    }

    public void setMessages (Messages[] messages)
    {
        this.messages = messages;
    }
//    public Data getdata ()
//    {
//        return data;
//    }
//    public String getTextToSpeech() {
//        return textToSpeech;
//    }
//    
//    public String getSpeech() {
//        return speech;
//    }
//
//    public String getDisplayText() {
//        return displayText;
//    }
//
//    public String getSource() {
//        return source;
//    }
}

