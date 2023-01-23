package .models.operations;


public class GetReadinglistResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetReadinglistResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetReadinglistResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetReadinglistResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}