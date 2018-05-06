package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic_card
{
    private Image image;

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image = "+image+"]";
    }
}
	