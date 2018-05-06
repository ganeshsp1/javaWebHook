package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items
{
    private Simple_response simple_response;
    
    private String title;

    private OptionInfo optionInfo;

    private Image image;
    public Simple_response getSimple_response ()
    {
        return simple_response;
    }

    public void setSimple_response (Simple_response simple_response)
    {
        this.simple_response = simple_response;
    }
    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public OptionInfo getOptionInfo ()
    {
        return optionInfo;
    }

    public void setOptionInfo (OptionInfo optionInfo)
    {
        this.optionInfo = optionInfo;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    private String description;

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

}
	