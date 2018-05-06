package vo;
public class From
{
    private String id;

    private String first_name;

    private String language_code;

    private String is_bot;

    private String last_name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getLanguage_code ()
    {
        return language_code;
    }

    public void setLanguage_code (String language_code)
    {
        this.language_code = language_code;
    }

    public String getIs_bot ()
    {
        return is_bot;
    }

    public void setIs_bot (String is_bot)
    {
        this.is_bot = is_bot;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", first_name = "+first_name+", language_code = "+language_code+", is_bot = "+is_bot+", last_name = "+last_name+"]";
    }
}