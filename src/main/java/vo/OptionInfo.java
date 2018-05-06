package vo;
public class OptionInfo
{
    private String[] synonyms;

    private String key;

    public String[] getSynonyms ()
    {
        return synonyms;
    }

    public void setSynonyms (String[] synonyms)
    {
        this.synonyms = synonyms;
    }

    public String getKey ()
    {
        return key;
    }

    public void setKey (String key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [synonyms = "+synonyms+", key = "+key+"]";
    }
}