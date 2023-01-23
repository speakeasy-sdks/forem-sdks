package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetApiDisplayAdsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Integer id;
    public GetApiDisplayAdsIdPathParams withId(Integer id) {
        this.id = id;
        return this;
    }
}