package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Google
{    
    private RichResponse richResponse;

    private String expectUserResponse;

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
}