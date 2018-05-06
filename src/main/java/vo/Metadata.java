package main.java.vo;
                 
public class Metadata
{
    private String intentId;

    private MatchedParameters[] matchedParameters;

    private String nluResponseTime;

    private String webhookUsed;

    private String intentName;

    private String isResponseToSlotfilling;

    private String webhookForSlotFillingUsed;

    public String getIntentId ()
    {
        return intentId;
    }

    public void setIntentId (String intentId)
    {
        this.intentId = intentId;
    }

    public MatchedParameters[] getMatchedParameters ()
    {
        return matchedParameters;
    }

    public void setMatchedParameters (MatchedParameters[] matchedParameters)
    {
        this.matchedParameters = matchedParameters;
    }

    public String getNluResponseTime ()
    {
        return nluResponseTime;
    }

    public void setNluResponseTime (String nluResponseTime)
    {
        this.nluResponseTime = nluResponseTime;
    }

    public String getWebhookUsed ()
    {
        return webhookUsed;
    }

    public void setWebhookUsed (String webhookUsed)
    {
        this.webhookUsed = webhookUsed;
    }

    public String getIntentName ()
    {
        return intentName;
    }

    public void setIntentName (String intentName)
    {
        this.intentName = intentName;
    }

    public String getIsResponseToSlotfilling ()
    {
        return isResponseToSlotfilling;
    }

    public void setIsResponseToSlotfilling (String isResponseToSlotfilling)
    {
        this.isResponseToSlotfilling = isResponseToSlotfilling;
    }

    public String getWebhookForSlotFillingUsed ()
    {
        return webhookForSlotFillingUsed;
    }

    public void setWebhookForSlotFillingUsed (String webhookForSlotFillingUsed)
    {
        this.webhookForSlotFillingUsed = webhookForSlotFillingUsed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [intentId = "+intentId+", matchedParameters = "+matchedParameters+", nluResponseTime = "+nluResponseTime+", webhookUsed = "+webhookUsed+", intentName = "+intentName+", isResponseToSlotfilling = "+isResponseToSlotfilling+", webhookForSlotFillingUsed = "+webhookForSlotFillingUsed+"]";
    }
}
