package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SharedOrganization
 * The organization the resource belongs to
**/public class SharedOrganization {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public SharedOrganization withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_image")
    public String profileImage;
    public SharedOrganization withProfileImage(String profileImage) {
        this.profileImage = profileImage;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_image_90")
    public String profileImage90;
    public SharedOrganization withProfileImage90(String profileImage90) {
        this.profileImage90 = profileImage90;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slug")
    public String slug;
    public SharedOrganization withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    public String username;
    public SharedOrganization withUsername(String username) {
        this.username = username;
        return this;
    }
}