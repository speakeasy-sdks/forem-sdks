package .models.operations;


public class GetUserUnpublishedArticlesResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetUserUnpublishedArticlesResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetUserUnpublishedArticlesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUserUnpublishedArticlesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}