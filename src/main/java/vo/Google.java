package main.java.vo;
public class Google
{
    private String expect_user_response;

    private Rich_response rich_response;

    public String getExpect_user_response ()
    {
        return expect_user_response;
    }

    public void setExpect_user_response (String expect_user_response)
    {
        this.expect_user_response = expect_user_response;
    }

    public Rich_response getRich_response ()
    {
        return rich_response;
    }

    public void setRich_response (Rich_response rich_response)
    {
        this.rich_response = rich_response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [expect_user_response = "+expect_user_response+", rich_response = "+rich_response+"]";
    }
}