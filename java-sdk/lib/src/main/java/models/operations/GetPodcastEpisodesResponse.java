package .models.operations;


public class GetPodcastEpisodesResponse {
    public String contentType;
    public GetPodcastEpisodesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.PodcastEpisodeIndex[] podcastEpisodeIndices;
    public GetPodcastEpisodesResponse withPodcastEpisodeIndices(.models.shared.PodcastEpisodeIndex[] podcastEpisodeIndices) {
        this.podcastEpisodeIndices = podcastEpisodeIndices;
        return this;
    }
    public Long statusCode;
    public GetPodcastEpisodesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}