package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import org.apache.http.NameValuePair;

public class Reactions {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Reactions(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * postApiReactions - create reaction
     *
     * This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:
     *         * "Like"ing an Article will create a new "like" Reaction from the user for that Articles
     *         * "Like"ing that Article a second time will return the previous "like"
    **/
    public .models.operations.PostApiReactionsResponse postApiReactions(.models.operations.PostApiReactionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/reactions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostApiReactionsResponse res = new .models.operations.PostApiReactionsResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
	
    /**
     * postApiReactionsToggle - toggle reaction
     *
     * This endpoint allows the client to toggle the user's reaction to a specified reactable (eg, Article, Comment, or User). For examples:
     *         * "Like"ing an Article will create a new "like" Reaction from the user for that Articles
     *         * "Like"ing that Article a second time will remove the "like" from the user
    **/
    public .models.operations.PostApiReactionsToggleResponse postApiReactionsToggle(.models.operations.PostApiReactionsToggleRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/reactions/toggle");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = .utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostApiReactionsToggleResponse res = new .models.operations.PostApiReactionsToggleResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
}