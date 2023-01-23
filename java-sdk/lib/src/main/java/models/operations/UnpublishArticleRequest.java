package .models.operations;


public class UnpublishArticleRequest {
    public UnpublishArticlePathParams pathParams;
    public UnpublishArticleRequest withPathParams(UnpublishArticlePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    public UnpublishArticleQueryParams queryParams;
    public UnpublishArticleRequest withQueryParams(UnpublishArticleQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}