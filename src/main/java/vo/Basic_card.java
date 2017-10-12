package main.java.vo;
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
	