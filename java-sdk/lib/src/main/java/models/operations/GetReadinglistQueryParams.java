package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetReadinglistQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public GetReadinglistQueryParams withPage(Integer page) {
        this.page = page;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public Integer perPage;
    public GetReadinglistQueryParams withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
}