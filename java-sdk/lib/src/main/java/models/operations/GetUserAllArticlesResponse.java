package .models.operations;


public class GetUserAllArticlesResponse {
    public .models.shared.ArticleIndex[] articleIndices;
    public GetUserAllArticlesResponse withArticleIndices(.models.shared.ArticleIndex[] articleIndices) {
        this.articleIndices = articleIndices;
        return this;
    }
    public String contentType;
    public GetUserAllArticlesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public GetUserAllArticlesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}