package .models.operations;


public class GetReadinglistRequest {
    public GetReadinglistQueryParams queryParams;
    public GetReadinglistRequest withQueryParams(GetReadinglistQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}