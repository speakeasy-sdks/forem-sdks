package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetUserPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public GetUserPathParams withId(String id) {
        this.id = id;
        return this;
    }
}