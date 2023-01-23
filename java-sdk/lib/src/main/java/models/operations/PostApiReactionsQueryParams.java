package .models.operations;

import .utils.SpeakeasyMetadata;
public class PostApiReactionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=category")
    public PostApiReactionsCategoryEnum category;
    public PostApiReactionsQueryParams withCategory(PostApiReactionsCategoryEnum category) {
        this.category = category;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reactable_id")
    public Integer reactableId;
    public PostApiReactionsQueryParams withReactableId(Integer reactableId) {
        this.reactableId = reactableId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reactable_type")
    public PostApiReactionsReactableTypeEnum reactableType;
    public PostApiReactionsQueryParams withReactableType(PostApiReactionsReactableTypeEnum reactableType) {
        this.reactableType = reactableType;
        return this;
    }
}