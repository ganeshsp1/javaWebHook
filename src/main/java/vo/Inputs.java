package vo;
public class Inputs
{
    private RawInputs[] rawInputs;

    private Arguments[] arguments;

    private String intent;

    public RawInputs[] getRawInputs ()
    {
        return rawInputs;
    }

    public void setRawInputs (RawInputs[] rawInputs)
    {
        this.rawInputs = rawInputs;
    }

    public Arguments[] getArguments ()
    {
        return arguments;
    }

    public void setArguments (Arguments[] arguments)
    {
        this.arguments = arguments;
    }

    public String getIntent ()
    {
        return intent;
    }

    public void setIntent (String intent)
    {
        this.intent = intent;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rawInputs = "+rawInputs+", arguments = "+arguments+", intent = "+intent+"]";
    }
}