package .models.operations;


public class GetUserArticlesRequest {
    public GetUserArticlesQueryParams queryParams;
    public GetUserArticlesRequest withQueryParams(GetUserArticlesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}