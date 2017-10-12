package main.java.vo;
public class Items
{
    private Simple_response simple_response;

    public Simple_response getSimple_response ()
    {
        return simple_response;
    }

    public void setSimple_response (Simple_response simple_response)
    {
        this.simple_response = simple_response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [simple_response = "+simple_response+"]";
    }
}
	