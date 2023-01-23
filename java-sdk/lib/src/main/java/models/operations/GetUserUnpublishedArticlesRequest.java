package .models.operations;


public class GetUserUnpublishedArticlesRequest {
    public GetUserUnpublishedArticlesQueryParams queryParams;
    public GetUserUnpublishedArticlesRequest withQueryParams(GetUserUnpublishedArticlesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}