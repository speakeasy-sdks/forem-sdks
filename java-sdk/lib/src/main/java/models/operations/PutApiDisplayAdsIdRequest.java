package .models.operations;

import .utils.SpeakeasyMetadata;
public class PutApiDisplayAdsIdRequest {
    public PutApiDisplayAdsIdPathParams pathParams;
    public PutApiDisplayAdsIdRequest withPathParams(PutApiDisplayAdsIdPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutApiDisplayAdsIdRequestBody request;
    public PutApiDisplayAdsIdRequest withRequest(PutApiDisplayAdsIdRequestBody request) {
        this.request = request;
        return this;
    }
}