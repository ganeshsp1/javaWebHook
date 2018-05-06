package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data
{
    private Surface surface;

    private Inputs[] inputs;

    private String isInSandbox;

    private Conversation conversation;

    private User user;

    private AvailableSurfaces[] availableSurfaces;

    private String update_id;

    private Message message;

    public Surface getSurface ()
    {
        return surface;
    }

    public void setSurface (Surface surface)
    {
        this.surface = surface;
    }

    public Inputs[] getInputs ()
    {
        return inputs;
    }

    public void setInputs (Inputs[] inputs)
    {
        this.inputs = inputs;
    }

    public String getIsInSandbox ()
    {
        return isInSandbox;
    }

    public void setIsInSandbox (String isInSandbox)
    {
        this.isInSandbox = isInSandbox;
    }

    public Conversation getConversation ()
    {
        return conversation;
    }

    public void setConversation (Conversation conversation)
    {
        this.conversation = conversation;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public AvailableSurfaces[] getAvailableSurfaces ()
    {
        return availableSurfaces;
    }

    public void setAvailableSurfaces (AvailableSurfaces[] availableSurfaces)
    {
        this.availableSurfaces = availableSurfaces;
    }
    public String getUpdate_id ()
    {
        return update_id;
    }

    public void setUpdate_id (String update_id)
    {
        this.update_id = update_id;
    }

    public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
    public String toString()
    {
        return "ClassPojo [surface = "+surface+", inputs = "+inputs+", isInSandbox = "+isInSandbox+", conversation = "+conversation+", user = "+user+", availableSurfaces = "+availableSurfaces+"]";
    }
}
