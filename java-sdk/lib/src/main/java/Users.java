package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;

public class Users {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Users(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getUser - A User
     *
     * This endpoint allows the client to retrieve a single user, either by id
     * or by the user's username.
     * 
     * For complete documentation, see the v0 API docs: https://developers.forem.com/api/v0#tag/users/operation/getUser
    **/
    public .models.operations.GetUserResponse getUser(.models.operations.GetUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/users/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetUserResponse res = new .models.operations.GetUserResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
	
	
    /**
     * suspendUser - Suspend a User
     *
     * This endpoint allows the client to suspend a user.
     * 
     * The user associated with the API key must have any 'admin' or 'moderator' role.
     * 
     * This specified user will be assigned the 'suspended' role. Suspending a user will stop the
     * user from posting new posts and comments. It doesn't delete any of the user's content, just
     * prevents them from creating new content while suspended. Users are not notified of their suspension
     * in the UI, so if you want them to know about this, you must notify them.
    **/
    public .models.operations.SuspendUserResponse suspendUser(.models.operations.SuspendUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/users/{id}/suspend", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.SuspendUserResponse res = new .models.operations.SuspendUserResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401) {
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }
	
	
    /**
     * unpublishUser - Unpublish a User's Articles and Comments
     *
     * This endpoint allows the client to unpublish all of the articles and
     * comments created by a user.
     * 
     * The user associated with the API key must have any 'admin' or 'moderator' role.
     * 
     * This specified user's articles and comments will be unpublished and will no longer be
     * visible to the public. They will remain in the database and will set back to draft status
     * on the specified user's  dashboard. Any notifications associated with the specified user's
     * articles and comments will be deleted.
     * 
     * Note this endpoint unpublishes articles and comments asychronously: it will return a 204 NO CONTENT
     * status code immediately, but the articles and comments will not be unpublished until the
     * request is completed on the server.
    **/
    public .models.operations.UnpublishUserResponse unpublishUser(.models.operations.UnpublishUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/users/{id}/unpublish", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.UnpublishUserResponse res = new .models.operations.UnpublishUserResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401) {
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }
	
}