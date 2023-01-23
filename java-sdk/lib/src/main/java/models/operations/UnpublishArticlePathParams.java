package .models.operations;

import .utils.SpeakeasyMetadata;
public class UnpublishArticlePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Integer id;
    public UnpublishArticlePathParams withId(Integer id) {
        this.id = id;
        return this;
    }
}