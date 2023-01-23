package .models.operations;

import .utils.SpeakeasyMetadata;
public class PutApiDisplayAdsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Integer id;
    public PutApiDisplayAdsIdPathParams withId(Integer id) {
        this.id = id;
        return this;
    }
}