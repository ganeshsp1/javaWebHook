package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Surface
{
    private Capabilities[] capabilities;

    public Capabilities[] getCapabilities ()
    {
        return capabilities;
    }

    public void setCapabilities (Capabilities[] capabilities)
    {
        this.capabilities = capabilities;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [capabilities = "+capabilities+"]";
    }
}
			
	