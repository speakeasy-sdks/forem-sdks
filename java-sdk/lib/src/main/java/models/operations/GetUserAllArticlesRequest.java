package .models.operations;


public class GetUserAllArticlesRequest {
    public GetUserAllArticlesQueryParams queryParams;
    public GetUserAllArticlesRequest withQueryParams(GetUserAllArticlesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}