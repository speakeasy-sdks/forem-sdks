package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Articles {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Articles(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getArticles - Published articles
     *
     * This endpoint allows the client to retrieve a list of articles.
     * 
     * "Articles" are all the posts that users create on DEV that typically
     * show up in the feed. They can be a blog post, a discussion question,
     * a help thread etc. but is referred to as article within the code.
     * 
     * By default it will return featured, published articles ordered
     * by descending popularity.
     * 
     * It supports pagination, each page will contain `30` articles by default.
    **/
    public .models.operations.GetArticlesResponse getArticles(.models.operations.GetArticlesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
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

        .models.operations.GetArticlesResponse res = new .models.operations.GetArticlesResponse() {{
            articleIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ArticleIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ArticleIndex[].class);
                res.articleIndices = out;
            }
        }

        return res;
    }
	
	
    /**
     * getUserAllArticles - User's all articles
     *
     * This endpoint allows the client to retrieve a list of all articles on behalf of an authenticated user.
     * 
     * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     * 
     * It will return both published and unpublished articles with pagination.
     * 
     * Unpublished articles will be at the top of the list in reverse chronological creation order. Published articles will follow in reverse chronological publication order.
     * 
     * By default a page will contain 30 articles.
    **/
    public .models.operations.GetUserAllArticlesResponse getUserAllArticles(.models.operations.GetUserAllArticlesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles/me/all");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
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

        .models.operations.GetUserAllArticlesResponse res = new .models.operations.GetUserAllArticlesResponse() {{
            articleIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ArticleIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ArticleIndex[].class);
                res.articleIndices = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
	
    /**
     * getUserArticles - User's articles
     *
     * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
     * 
     * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     * 
     * Published articles will be in reverse chronological publication order.
     * 
     * It will return published articles with pagination. By default a page will contain 30 articles.
    **/
    public .models.operations.GetUserArticlesResponse getUserArticles(.models.operations.GetUserArticlesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles/me");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
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

        .models.operations.GetUserArticlesResponse res = new .models.operations.GetUserArticlesResponse() {{
            articleIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ArticleIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ArticleIndex[].class);
                res.articleIndices = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
	
    /**
     * getUserPublishedArticles - User's published articles
     *
     * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
     * 
     * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     * 
     * Published articles will be in reverse chronological publication order.
     * 
     * It will return published articles with pagination. By default a page will contain 30 articles.
    **/
    public .models.operations.GetUserPublishedArticlesResponse getUserPublishedArticles(.models.operations.GetUserPublishedArticlesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles/me/published");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
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

        .models.operations.GetUserPublishedArticlesResponse res = new .models.operations.GetUserPublishedArticlesResponse() {{
            articleIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ArticleIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ArticleIndex[].class);
                res.articleIndices = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
	
    /**
     * getUserUnpublishedArticles - User's unpublished articles
     *
     * This endpoint allows the client to retrieve a list of unpublished articles on behalf of an authenticated user.
     * 
     * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
     * 
     * Unpublished articles will be in reverse chronological creation order.
     * 
     * It will return unpublished articles with pagination. By default a page will contain 30 articles.
    **/
    public .models.operations.GetUserUnpublishedArticlesResponse getUserUnpublishedArticles(.models.operations.GetUserUnpublishedArticlesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles/me/unpublished");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
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

        .models.operations.GetUserUnpublishedArticlesResponse res = new .models.operations.GetUserUnpublishedArticlesResponse() {{
            articleIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.ArticleIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.ArticleIndex[].class);
                res.articleIndices = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
        }

        return res;
    }
	
	
    /**
     * unpublishArticle - Unpublish an article
     *
     * This endpoint allows the client to unpublish an article.
     * 
     * The user associated with the API key must have any 'admin' or 'moderator' role.
     * 
     * The article will be unpublished and will no longer be visible to the public. It will remain
     * in the database and will set back to draft status on the author's posts dashboard. Any
     * notifications associated with the article will be deleted. Any comments on the article
     * will remain.
    **/
    public .models.operations.UnpublishArticleResponse unpublishArticle(.models.operations.UnpublishArticleRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/articles/{id}/unpublish", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
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

        .models.operations.UnpublishArticleResponse res = new .models.operations.UnpublishArticleResponse() {{
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