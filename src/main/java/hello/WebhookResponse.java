package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import vo.Buttons;
import vo.Card;
import vo.FollowupEventInput;
import vo.FulfillmentMessages;
import vo.Google;
import vo.Items;
import vo.Messages;
import vo.OutputContexts;
import vo.Payload;
import vo.QueryResult;
import vo.RichResponse;
import vo.SimpleResponse;
import vo.Telegram;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WebhookResponse {
//    private final String speech;
//    private final String displayText;
//    private final String textToSpeech;
    private String source = "java-webhook";
    private FollowupEventInput followupEventInput;

    private OutputContexts[] outputContexts;
    
    private Payload payload;

    private String fulfillmentText;

    private FulfillmentMessages[] fulfillmentMessages;
    
    public WebhookResponse(String speech, String url, QueryResult result) {
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
    	
    	if(result.getAction().equals("test")){
    		
    		this.fulfillmentText = "This is a text response.";
    		FulfillmentMessages fulfillmentMessage1 = new FulfillmentMessages();
    		Card card = new Card();
    		card.setTitle("card title");
    		card.setSubtitle("card text");
    		card.setImageUri("https://assistant.google.com/static/images/molecule/Molecule-Formation-stop.png");
    		Buttons button = new Buttons();
    		button.setText("button text");
    		button.setPostback("https://assistant.google.com/");
			Buttons[] buttons = {button };
			card.setButtons(buttons );
			fulfillmentMessage1.setCard(card );
			FulfillmentMessages[] fulfillmentMessages = {fulfillmentMessage1};
    		this.setFulfillmentMessages(fulfillmentMessages);
    		payload = new Payload();
    		Google google = new Google();
    		google.setExpectUserResponse("true");
    		RichResponse richResponse = new RichResponse();
    		Items item = new Items();
    		SimpleResponse simpleResponse = new SimpleResponse();
    		simpleResponse.setTextToSpeech("this is a simple response");
			item.setSimpleResponse(simpleResponse );
			Items[] items = {item};
			richResponse.setItems(items );
			google.setRichResponse(richResponse);
			google.setText("google Text");
			payload.setGoogle(google );
    		setPayload(payload);
    		Telegram telegram = new Telegram();
    		telegram.setText("Hello, telegram!");
    		payload.setTelegram(telegram );
    		setOutputContexts(result.getOutputContexts());
    		
    		
    		
    		
    		
//    		this.speech = speech;
//          this.displayText = displayText;
//          this.data = new Data();
//          Google google = new Google();
//          google.setExpect_user_response("true");
//          Rich_response rich_response = new Rich_response();
//          Simple_response simple_response = new Simple_response();
//          simple_response.setText_to_speech("This is a sample text");
//          Items item = new Items();
//          item.setSimple_response(simple_response);
//          Items[] items = {item};
//  		rich_response.setItems(items );
//  		google.setRich_response(rich_response );
//
//		Messages message = new Messages();
//  		message.setType("simple_response");
//    	message.setPlatform("google");
//    	message.setTextToSpeech("Hi");
//    	message.setSpeech("Hi");
//    		setMessages(messages);
    	}else {
    		
//    	setSpeech("Hey this is what I found");
//    	setDisplayText("Hey this is what I found!");
    	
    	Messages message = new Messages();
    	message.setType("0");
    	message.setPlatform("telegram");
    	message.setSpeech("Hey there!");    	
    	
    	Messages message1 = new Messages();
    	message1.setType("1");
    	message1.setPlatform("telegram");
    	message1.setTitle("card title");
    	message1.setImageUrl(url);
    	Buttons[] buttons = new Buttons[1];
    	Buttons button = new Buttons();
    	button.setText("button text");
    	button.setPostback("https://stackoverflow.com/questions/21134960/what-does-changes-not-staged-for-commit-mean");
    	buttons[0] = button;
    	message1.setButtons(buttons );
		
		Messages message3 = new Messages();
    	message3.setType("0");
    	message3.setSpeech("Hey there!");    
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
    	
    	Messages[] messages = {message,message1,message3};
//		setMessages(messages);
    	}
    }




    public String getSource ()
    {
        return source;
    }


	public FollowupEventInput getFollowupEventInput() {
		return followupEventInput;
	}



	public void setFollowupEventInput(FollowupEventInput followupEventInput) {
		this.followupEventInput = followupEventInput;
	}



	public OutputContexts[] getOutputContexts() {
		return outputContexts;
	}



	public void setOutputContexts(OutputContexts[] outputContexts) {
		this.outputContexts = outputContexts;
	}



	public Payload getPayload() {
		return payload;
	}



	public void setPayload(Payload payload) {
		this.payload = payload;
	}



	public String getFulfillmentText() {
		return fulfillmentText;
	}



	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}



	public FulfillmentMessages[] getFulfillmentMessages() {
		return fulfillmentMessages;
	}



	public void setFulfillmentMessages(FulfillmentMessages[] fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
}

