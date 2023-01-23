package .models.operations;


public class GetUserPublishedArticlesResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetUserPublishedArticlesResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetUserPublishedArticlesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUserPublishedArticlesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}