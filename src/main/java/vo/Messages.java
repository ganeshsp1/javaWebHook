package main.java.vo;
public class Messages
{
    private String id;

    private String speech;

    private String type;
    
    private String platform;

    private Items[] items;
    
    private String textToSpeech;
    
    public String getTextToSpeech ()
    {
        return textToSpeech;
    }

    public void setTextToSpeech (String textToSpeech)
    {
        this.textToSpeech = textToSpeech;
    }
    
    public String getPlatform ()
    {
        return platform;
    }

    public void setPlatform (String platform)
    {
        this.platform = platform;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSpeech ()
    {
        return speech;
    }

    public void setSpeech (String speech)
    {
        this.speech = speech;
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
        return "ClassPojo [platform = "+platform+", items = "+items+",id = "+id+", speech = "+speech+", type = "+type+", textToSpeech = "+textToSpeech+"]";
    }
}