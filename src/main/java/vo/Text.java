package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text
{
    private String[] text;

    public String[] getText ()
    {
        return text;
    }

    public void setText (String[] text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+"]";
    }
}
