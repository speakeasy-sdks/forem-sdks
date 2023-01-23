package .models.operations;

import .utils.SpeakeasyMetadata;
public class SuspendUserPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Integer id;
    public SuspendUserPathParams withId(Integer id) {
        this.id = id;
        return this;
    }
}