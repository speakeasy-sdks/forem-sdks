package .models.operations;


public class GetApiDisplayAdsResponse {
    public String contentType;
    public GetApiDisplayAdsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetApiDisplayAdsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}