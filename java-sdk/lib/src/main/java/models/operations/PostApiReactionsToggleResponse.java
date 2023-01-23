package .models.operations;


public class PostApiReactionsToggleResponse {
    public String contentType;
    public PostApiReactionsToggleResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostApiReactionsToggleResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}