package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OutputContexts
{
    private String name;

    private Parameters parameters;

    private String lifespanCount;

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

    public String getLifespanCount ()
    {
        return lifespanCount;
    }

    public void setLifespanCount (String lifespanCount)
    {
        this.lifespanCount = lifespanCount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", parameters = "+parameters+", lifespanCount = "+lifespanCount+"]";
    }}
	