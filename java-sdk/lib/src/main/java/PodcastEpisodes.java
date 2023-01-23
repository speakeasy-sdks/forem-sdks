package ;

import .utils.HTTPClient;
import .utils.HTTPRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class PodcastEpisodes {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public PodcastEpisodes(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
	
    /**
     * getPodcastEpisodes - Podcast Episodes
     *
     * This endpoint allows the client to retrieve a list of podcast episodes.
     *         "Podcast episodes" are episodes belonging to podcasts.
     *         It will only return active (reachable) podcast episodes that belong to published podcasts available on the platform, ordered by descending publication date.
     *         It supports pagination, each page will contain 30 articles by default.
    **/
    public .models.operations.GetPodcastEpisodesResponse getPodcastEpisodes(.models.operations.GetPodcastEpisodesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = .utils.Utils.generateURL(baseUrl, "/api/podcast_episodes");
        
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

        .models.operations.GetPodcastEpisodesResponse res = new .models.operations.GetPodcastEpisodesResponse() {{
            podcastEpisodeIndices = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                .models.shared.PodcastEpisodeIndex[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), .models.shared.PodcastEpisodeIndex[].class);
                res.podcastEpisodeIndices = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }
	
}