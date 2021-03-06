package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Messages
{
    private String type;
    
    private String platform;

    private String speech;

    private String title;

    private Items[] items;

    private String imageUrl;

    private String subtitle;

    private Buttons[] buttons;
    
    private String textToSpeech;

    public String getPlatform ()
    {
        return platform;
    }

    public void setPlatform (String platform)
    {
        this.platform = platform;
    }

    public String getSpeech ()
    {
        return speech;
    }

    public void setSpeech (String speech)
    {
        this.speech = speech;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getSubtitle ()
    {
        return subtitle;
    }

    public void setSubtitle (String subtitle)
    {
        this.subtitle = subtitle;
    }

    public Buttons[] getButtons ()
    {
        return buttons;
    }

    public void setButtons (Buttons[] buttons)
    {
        this.buttons = buttons;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [platform = "+platform+", speech = "+speech+", title = "+title+", items = "+items+", imageUrl = "+imageUrl+", subtitle = "+subtitle+", buttons = "+buttons+", type = "+type+"]";
    }

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}
}
