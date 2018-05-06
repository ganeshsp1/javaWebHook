package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message
{
    private String text;

    private String message_id;

    private From from;

    private Chat chat;

    private String date;

    private Entities[] entities;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getMessage_id ()
    {
        return message_id;
    }

    public void setMessage_id (String message_id)
    {
        this.message_id = message_id;
    }

    public From getFrom ()
    {
        return from;
    }

    public void setFrom (From from)
    {
        this.from = from;
    }

    public Chat getChat ()
    {
        return chat;
    }

    public void setChat (Chat chat)
    {
        this.chat = chat;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public Entities[] getEntities ()
    {
        return entities;
    }

    public void setEntities (Entities[] entities)
    {
        this.entities = entities;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", message_id = "+message_id+", from = "+from+", chat = "+chat+", date = "+date+", entities = "+entities+"]";
    }
}