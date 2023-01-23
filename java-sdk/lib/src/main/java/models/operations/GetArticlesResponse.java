package .models.operations;


public class GetArticlesResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetArticlesResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetArticlesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetArticlesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}