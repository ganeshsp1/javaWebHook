package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OriginalDetectIntentRequest
{
    private String source;

    private Payload payload;

    private String version;

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public Payload getPayload ()
    {
        return payload;
    }

    public void setPayload (Payload payload)
    {
        this.payload = payload;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [source = "+source+", payload = "+payload+", version = "+version+"]";
    }
}