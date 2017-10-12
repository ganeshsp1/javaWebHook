package main.java.vo;
public class Data
{
    private Google google;

    public Google getGoogle ()
    {
        return google;
    }

    public void setGoogle (Google google)
    {
        this.google = google;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [google = "+google+"]";
    }
}