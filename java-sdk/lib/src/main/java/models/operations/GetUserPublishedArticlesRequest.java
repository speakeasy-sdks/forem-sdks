package .models.operations;


public class GetUserPublishedArticlesRequest {
    public GetUserPublishedArticlesQueryParams queryParams;
    public GetUserPublishedArticlesRequest withQueryParams(GetUserPublishedArticlesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}