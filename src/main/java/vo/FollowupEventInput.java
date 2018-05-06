package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FollowupEventInput
{
    private String languageCode;

    private String name;

    private Parameters parameters;

    public String getLanguageCode ()
    {
        return languageCode;
    }

    public void setLanguageCode (String languageCode)
    {
        this.languageCode = languageCode;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Parameters getParameters ()
    {
        return parameters;
    }

    public void setParameters (Parameters parameters)
    {
        this.parameters = parameters;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [languageCode = "+languageCode+", name = "+name+", parameters = "+parameters+"]";
    }
}