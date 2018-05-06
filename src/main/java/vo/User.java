package vo;
public class User
{
    private String lastSeen;

    private String userId;

    private String locale;

    public String getLastSeen ()
    {
        return lastSeen;
    }

    public void setLastSeen (String lastSeen)
    {
        this.lastSeen = lastSeen;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getLocale ()
    {
        return locale;
    }

    public void setLocale (String locale)
    {
        this.locale = locale;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lastSeen = "+lastSeen+", userId = "+userId+", locale = "+locale+"]";
    }
}