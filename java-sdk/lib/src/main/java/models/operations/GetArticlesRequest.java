package .models.operations;


public class GetArticlesRequest {
    public GetArticlesQueryParams queryParams;
    public GetArticlesRequest withQueryParams(GetArticlesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}