package .models.operations;

import .utils.SpeakeasyMetadata;
public class UnpublishArticleQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=note")
    public String note;
    public UnpublishArticleQueryParams withNote(String note) {
        this.note = note;
        return this;
    }
}