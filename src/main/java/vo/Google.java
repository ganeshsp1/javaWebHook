package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Google
{    
    private RichResponse richResponse;

    private String expectUserResponse;
    
    private String text;

    public RichResponse getRichResponse ()
    {
        return richResponse;
    }

    public void setRichResponse (RichResponse richResponse)
    {
        this.richResponse = richResponse;
    }

    public String getExpectUserResponse ()
    {
        return expectUserResponse;
    }

    public void setExpectUserResponse (String expectUserResponse)
    {
        this.expectUserResponse = expectUserResponse;
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}