package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PodcastEpisodeIndex
 * Representation of a podcast episode returned in a list
**/public class PodcastEpisodeIndex {
    @JsonProperty("class_name")
    public String className;
    public PodcastEpisodeIndex withClassName(String className) {
        this.className = className;
        return this;
    }
    @JsonProperty("id")
    public Integer id;
    public PodcastEpisodeIndex withId(Integer id) {
        this.id = id;
        return this;
    }
    @JsonProperty("image_url")
    public String imageUrl;
    public PodcastEpisodeIndex withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @JsonProperty("path")
    public String path;
    public PodcastEpisodeIndex withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonProperty("podcast")
    public SharedPodcast podcast;
    public PodcastEpisodeIndex withPodcast(SharedPodcast podcast) {
        this.podcast = podcast;
        return this;
    }
    @JsonProperty("title")
    public String title;
    public PodcastEpisodeIndex withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonProperty("type_of")
    public String typeOf;
    public PodcastEpisodeIndex withTypeOf(String typeOf) {
        this.typeOf = typeOf;
        return this;
    }
}