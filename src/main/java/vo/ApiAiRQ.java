package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiAiRQ
{
    private String timestamp;

    private String id;

    private Result result;

    private String sessionId;

    private Status status;

    private OriginalRequest originalRequest;

    private String lang;
    
	private String responseId;

    private String session;

    private QueryResult queryResult;

    private OriginalDetectIntentRequest originalDetectIntentRequest;


    public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}
	public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Result getResult ()
    {
        return result;
    }

    public void setResult (Result result)
    {
        this.result = result;
    }

    public String getSessionId ()
    {
        return sessionId;
    }

    public void setSessionId (String sessionId)
    {
        this.sessionId = sessionId;
    }

    public Status getStatus ()
    {
        return status;
    }

    public void setStatus (Status status)
    {
        this.status = status;
    }

    public OriginalRequest getOriginalRequest ()
    {
        return originalRequest;
    }

    public void setOriginalRequest (OriginalRequest originalRequest)
    {
        this.originalRequest = originalRequest;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", id = "+id+", result = "+result+", sessionId = "+sessionId+", status = "+status+", originalRequest = "+originalRequest+", lang = "+lang+"]";
    }
}
			
