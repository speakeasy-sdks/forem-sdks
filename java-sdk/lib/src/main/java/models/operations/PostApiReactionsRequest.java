package .models.operations;


public class PostApiReactionsRequest {
    public PostApiReactionsQueryParams queryParams;
    public PostApiReactionsRequest withQueryParams(PostApiReactionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}