package .models.operations;


public class PostApiDisplayAdsResponse {
    public String contentType;
    public PostApiDisplayAdsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostApiDisplayAdsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}