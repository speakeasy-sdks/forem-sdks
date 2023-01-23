package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import .utils.SerializedBody;

public class DisplayAds {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DisplayAds(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getApiDisplayAds - display ads
     *
     * This endpoint allows the client to retrieve a list of all display ads.
    **/
    public .models.operations.GetApiDisplayAdsResponse getApiDisplayAds() throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/display_ads");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetApiDisplayAdsResponse res = new .models.operations.GetApiDisplayAdsResponse() {{
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
     * getApiDisplayAdsId - display ad
     *
     * This endpoint allows the client to retrieve a single display ad, via its id.
    **/
    public .models.operations.GetApiDisplayAdsIdResponse getApiDisplayAdsId(.models.operations.GetApiDisplayAdsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/display_ads/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.GetApiDisplayAdsIdResponse res = new .models.operations.GetApiDisplayAdsIdResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 401) {
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }
	
	
    /**
     * postApiDisplayAds - display ads
     *
     * This endpoint allows the client to create a new display ad.
    **/
    public .models.operations.PostApiDisplayAdsResponse postApiDisplayAds(.models.operations.PostApiDisplayAdsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/display_ads");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PostApiDisplayAdsResponse res = new .models.operations.PostApiDisplayAdsResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 401) {
        }
        else if (httpRes.statusCode() == 422) {
        }

        return res;
    }
	
	
    /**
     * putApiDisplayAdsId - display ads
     *
     * This endpoint allows the client to update the attributes of a single display ad, via its id.
    **/
    public .models.operations.PutApiDisplayAdsIdResponse putApiDisplayAdsId(.models.operations.PutApiDisplayAdsIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/display_ads/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = .utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutApiDisplayAdsIdResponse res = new .models.operations.PutApiDisplayAdsIdResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 401) {
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }
	
	
    /**
     * putApiDisplayAdsIdUnpublish - unpublish
     *
     * This endpoint allows the client to remove a display ad from rotation by un-publishing it.
    **/
    public .models.operations.PutApiDisplayAdsIdUnpublishResponse putApiDisplayAdsIdUnpublish(.models.operations.PutApiDisplayAdsIdUnpublishRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/display_ads/{id}/unpublish", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        .models.operations.PutApiDisplayAdsIdUnpublishResponse res = new .models.operations.PutApiDisplayAdsIdUnpublishResponse() {{
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