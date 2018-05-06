package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RichResponse
{
    private Items[] items;

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [items = "+items+"]";
    }
}