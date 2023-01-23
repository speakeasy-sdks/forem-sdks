package .models.operations;


public class SuspendUserRequest {
    public SuspendUserPathParams pathParams;
    public SuspendUserRequest withPathParams(SuspendUserPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
}