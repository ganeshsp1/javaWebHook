package main.java.vo;
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
			
	