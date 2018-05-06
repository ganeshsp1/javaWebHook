package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image
{
    private String accessibility_text;

    private String url;

    public String getAccessibility_text ()
    {
        return accessibility_text;
    }

    public void setAccessibility_text (String accessibility_text)
    {
        this.accessibility_text = accessibility_text;
    }

    public String getUrl ()
    {
        return url;
        
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [accessibility_text = "+accessibility_text+", url = "+url+"]";
    }
}