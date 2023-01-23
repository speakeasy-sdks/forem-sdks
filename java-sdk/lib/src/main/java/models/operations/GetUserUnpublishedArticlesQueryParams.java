package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetUserUnpublishedArticlesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public GetUserUnpublishedArticlesQueryParams withPage(Integer page) {
        this.page = page;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public Integer perPage;
    public GetUserUnpublishedArticlesQueryParams withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
}