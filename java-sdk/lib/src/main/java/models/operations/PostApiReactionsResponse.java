package .models.operations;


public class PostApiReactionsResponse {
    public String contentType;
    public PostApiReactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostApiReactionsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}