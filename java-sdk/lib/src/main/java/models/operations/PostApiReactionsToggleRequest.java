package .models.operations;


public class PostApiReactionsToggleRequest {
    public PostApiReactionsToggleQueryParams queryParams;
    public PostApiReactionsToggleRequest withQueryParams(PostApiReactionsToggleQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}