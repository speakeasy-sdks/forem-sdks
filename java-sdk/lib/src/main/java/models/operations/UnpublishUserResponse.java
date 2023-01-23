package .models.operations;


public class UnpublishUserResponse {
    public String contentType;
    public UnpublishUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public UnpublishUserResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}