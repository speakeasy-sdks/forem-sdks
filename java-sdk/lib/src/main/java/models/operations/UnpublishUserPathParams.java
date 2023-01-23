package .models.operations;

import .utils.SpeakeasyMetadata;
public class UnpublishUserPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Integer id;
    public UnpublishUserPathParams withId(Integer id) {
        this.id = id;
        return this;
    }
}