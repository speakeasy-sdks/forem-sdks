package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetPodcastEpisodesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    public Integer page;
    public GetPodcastEpisodesQueryParams withPage(Integer page) {
        this.page = page;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public Integer perPage;
    public GetPodcastEpisodesQueryParams withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=username")
    public String username;
    public GetPodcastEpisodesQueryParams withUsername(String username) {
        this.username = username;
        return this;
    }
}