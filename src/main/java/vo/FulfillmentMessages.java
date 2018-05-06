package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FulfillmentMessages
{
    private String platform;

    private Card card;
    
    private Text text;

    public String getPlatform ()
    {
        return platform;
    }

    public void setPlatform (String platform)
    {
        this.platform = platform;
    }

    public Card getCard ()
    {
        return card;
    }

    public void setCard (Card card)
    {
        this.card = card;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [platform = "+platform+", card = "+card+"]";
    }

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}
}
	