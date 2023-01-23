package .models.operations;

import .utils.SpeakeasyMetadata;
public class PostApiDisplayAdsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostApiDisplayAdsRequestBody request;
    public PostApiDisplayAdsRequest withRequest(PostApiDisplayAdsRequestBody request) {
        this.request = request;
        return this;
    }
}