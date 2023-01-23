package .models.operations;


public class UnpublishArticleResponse {
    public String contentType;
    public UnpublishArticleResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public UnpublishArticleResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}