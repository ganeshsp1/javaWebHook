package vo;
public class Simple_response
{
    private String text_to_speech;

    public String getText_to_speech ()
    {
        return text_to_speech;
    }

    public void setText_to_speech (String text_to_speech)
    {
        this.text_to_speech = text_to_speech;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text_to_speech = "+text_to_speech+"]";
    }
}