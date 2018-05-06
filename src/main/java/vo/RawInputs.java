package vo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RawInputs
{
    private String query;

    private String inputType;

    public String getQuery ()
    {
        return query;
    }

    public void setQuery (String query)
    {
        this.query = query;
    }

    public String getInputType ()
    {
        return inputType;
    }

    public void setInputType (String inputType)
    {
        this.inputType = inputType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [query = "+query+", inputType = "+inputType+"]";
    }
}