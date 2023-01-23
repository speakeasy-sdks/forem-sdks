package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetProfileImagePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=username")
    public String username;
    public GetProfileImagePathParams withUsername(String username) {
        this.username = username;
        return this;
    }
}