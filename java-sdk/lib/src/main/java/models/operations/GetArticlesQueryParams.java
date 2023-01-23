package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetArticlesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=collection_id")
    public Integer collectionId;
    public GetArticlesQueryParams withCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public GetArticlesQueryParams withPage(Integer page) {
        this.page = page;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public Integer perPage;
    public GetArticlesQueryParams withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=state")
    public .models.shared.PerPageParam30to1000Enum state;
    public GetArticlesQueryParams withState(.models.shared.PerPageParam30to1000Enum state) {
        this.state = state;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tag")
    public String tag;
    public GetArticlesQueryParams withTag(String tag) {
        this.tag = tag;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String tags;
    public GetArticlesQueryParams withTags(String tags) {
        this.tags = tags;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags_exclude")
    public String tagsExclude;
    public GetArticlesQueryParams withTagsExclude(String tagsExclude) {
        this.tagsExclude = tagsExclude;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=top")
    public Integer top;
    public GetArticlesQueryParams withTop(Integer top) {
        this.top = top;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=username")
    public String username;
    public GetArticlesQueryParams withUsername(String username) {
        this.username = username;
        return this;
    }
}