package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SharedPodcast
 * The podcast that the resource belongs to
**/public class SharedPodcast {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    public String imageUrl;
    public SharedPodcast withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slug")
    public String slug;
    public SharedPodcast withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;
    public SharedPodcast withTitle(String title) {
        this.title = title;
        return this;
    }
}