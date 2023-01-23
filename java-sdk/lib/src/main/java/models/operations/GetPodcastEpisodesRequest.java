package .models.operations;


public class GetPodcastEpisodesRequest {
    public GetPodcastEpisodesQueryParams queryParams;
    public GetPodcastEpisodesRequest withQueryParams(GetPodcastEpisodesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
}