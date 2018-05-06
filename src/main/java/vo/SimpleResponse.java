package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleResponse
{
    private String textToSpeech;

    public String getTextToSpeech ()
    {
        return textToSpeech;
    }

    public void setTextToSpeech (String textToSpeech)
    {
        this.textToSpeech = textToSpeech;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [textToSpeech = "+textToSpeech+"]";
    }
}