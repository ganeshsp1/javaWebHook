package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card
{
    private String imageUri;

    private String title;

    private String subtitle;

    private Buttons[] buttons;

    public String getImageUri ()
    {
        return imageUri;
    }

    public void setImageUri (String imageUri)
    {
        this.imageUri = imageUri;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getSubtitle ()
    {
        return subtitle;
    }

    public void setSubtitle (String subtitle)
    {
        this.subtitle = subtitle;
    }

    public Buttons[] getButtons ()
    {
        return buttons;
    }

    public void setButtons (Buttons[] buttons)
    {
        this.buttons = buttons;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [imageUri = "+imageUri+", title = "+title+", subtitle = "+subtitle+", buttons = "+buttons+"]";
    }
}