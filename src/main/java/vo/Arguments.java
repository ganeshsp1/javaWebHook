package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arguments
{
    private String rawText;

    private String name;

    private String textValue;

    public String getRawText ()
    {
        return rawText;
    }

    public void setRawText (String rawText)
    {
        this.rawText = rawText;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getTextValue ()
    {
        return textValue;
    }

    public void setTextValue (String textValue)
    {
        this.textValue = textValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rawText = "+rawText+", name = "+name+", textValue = "+textValue+"]";
    }
}