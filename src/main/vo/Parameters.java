package main.vo;
public class Parameters
{
    private String geocity;

    public String getGeocity ()
    {
        return geocity;
    }

    public void setGeocity (String geocity)
    {
        this.geocity = geocity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [geo-city = "+geocity+"]";
    }
}