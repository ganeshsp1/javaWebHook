package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Conversation
{
    private String conversationToken;

    private String conversationId;

    private String type;

    public String getConversationToken ()
    {
        return conversationToken;
    }

    public void setConversationToken (String conversationToken)
    {
        this.conversationToken = conversationToken;
    }

    public String getConversationId ()
    {
        return conversationId;
    }

    public void setConversationId (String conversationId)
    {
        this.conversationId = conversationId;
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
        return "ClassPojo [conversationToken = "+conversationToken+", conversationId = "+conversationId+", type = "+type+"]";
    }
}