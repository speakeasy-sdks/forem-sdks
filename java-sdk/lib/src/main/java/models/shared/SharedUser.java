package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SharedUser
 * The resource creator
**/public class SharedUser {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("github_username")
    public String githubUsername;
    public SharedUser withGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SharedUser withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_image")
    public String profileImage;
    public SharedUser withProfileImage(String profileImage) {
        this.profileImage = profileImage;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_image_90")
    public String profileImage90;
    public SharedUser withProfileImage90(String profileImage90) {
        this.profileImage90 = profileImage90;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("twitter_username")
    public String twitterUsername;
    public SharedUser withTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    public String username;
    public SharedUser withUsername(String username) {
        this.username = username;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website_url")
    public String websiteUrl;
    public SharedUser withWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }
}