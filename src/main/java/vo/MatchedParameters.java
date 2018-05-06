package main.java.vo;
public class MatchedParameters
{
    private String isList;

    private String dataType;

    private String name;

    private String value;

    public String getIsList ()
    {
        return isList;
    }

    public void setIsList (String isList)
    {
        this.isList = isList;
    }

    public String getDataType ()
    {
        return dataType;
    }

    public void setDataType (String dataType)
    {
        this.dataType = dataType;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isList = "+isList+", dataType = "+dataType+", name = "+name+", value = "+value+"]";
    }
}