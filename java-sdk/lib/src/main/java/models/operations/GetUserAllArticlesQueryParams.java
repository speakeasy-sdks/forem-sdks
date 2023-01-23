package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetUserAllArticlesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public GetUserAllArticlesQueryParams withPage(Integer page) {
        this.page = page;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public Integer perPage;
    public GetUserAllArticlesQueryParams withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
}