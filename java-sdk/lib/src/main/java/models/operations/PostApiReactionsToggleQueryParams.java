package .models.operations;

import .utils.SpeakeasyMetadata;
public class PostApiReactionsToggleQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=category")
    public PostApiReactionsToggleCategoryEnum category;
    public PostApiReactionsToggleQueryParams withCategory(PostApiReactionsToggleCategoryEnum category) {
        this.category = category;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reactable_id")
    public Integer reactableId;
    public PostApiReactionsToggleQueryParams withReactableId(Integer reactableId) {
        this.reactableId = reactableId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reactable_type")
    public PostApiReactionsToggleReactableTypeEnum reactableType;
    public PostApiReactionsToggleQueryParams withReactableType(PostApiReactionsToggleReactableTypeEnum reactableType) {
        this.reactableType = reactableType;
        return this;
    }
}