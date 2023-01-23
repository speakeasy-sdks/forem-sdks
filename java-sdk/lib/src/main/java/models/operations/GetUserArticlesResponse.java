package .models.operations;


public class GetUserArticlesResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetUserArticlesResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetUserArticlesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUserArticlesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}