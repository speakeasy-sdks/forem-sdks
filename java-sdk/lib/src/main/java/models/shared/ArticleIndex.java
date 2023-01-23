package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * ArticleIndex
 * Representation of an article or post returned in a list
**/public class ArticleIndex {
    @JsonProperty("canonical_url")
    public String canonicalUrl;
    public ArticleIndex withCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
        return this;
    }
    @JsonProperty("cover_image")
    public String coverImage;
    public ArticleIndex withCoverImage(String coverImage) {
        this.coverImage = coverImage;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ArticleIndex withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("crossposted_at")
    public OffsetDateTime crosspostedAt;
    public ArticleIndex withCrosspostedAt(OffsetDateTime crosspostedAt) {
        this.crosspostedAt = crosspostedAt;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public ArticleIndex withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("edited_at")
    public OffsetDateTime editedAt;
    public ArticleIndex withEditedAt(OffsetDateTime editedAt) {
        this.editedAt = editedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flare_tag")
    public ArticleFlareTag flareTag;
    public ArticleIndex withFlareTag(ArticleFlareTag flareTag) {
        this.flareTag = flareTag;
        return this;
    }
    @JsonProperty("id")
    public Integer id;
    public ArticleIndex withId(Integer id) {
        this.id = id;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("last_comment_at")
    public OffsetDateTime lastCommentAt;
    public ArticleIndex withLastCommentAt(OffsetDateTime lastCommentAt) {
        this.lastCommentAt = lastCommentAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization")
    public SharedOrganization organization;
    public ArticleIndex withOrganization(SharedOrganization organization) {
        this.organization = organization;
        return this;
    }
    @JsonProperty("path")
    public String path;
    public ArticleIndex withPath(String path) {
        this.path = path;
        return this;
    }
    @JsonProperty("positive_reactions_count")
    public Integer positiveReactionsCount;
    public ArticleIndex withPositiveReactionsCount(Integer positiveReactionsCount) {
        this.positiveReactionsCount = positiveReactionsCount;
        return this;
    }
    @JsonProperty("public_reactions_count")
    public Integer publicReactionsCount;
    public ArticleIndex withPublicReactionsCount(Integer publicReactionsCount) {
        this.publicReactionsCount = publicReactionsCount;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("published_at")
    public OffsetDateTime publishedAt;
    public ArticleIndex withPublishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("published_timestamp")
    public OffsetDateTime publishedTimestamp;
    public ArticleIndex withPublishedTimestamp(OffsetDateTime publishedTimestamp) {
        this.publishedTimestamp = publishedTimestamp;
        return this;
    }
    @JsonProperty("readable_publish_date")
    public String readablePublishDate;
    public ArticleIndex withReadablePublishDate(String readablePublishDate) {
        this.readablePublishDate = readablePublishDate;
        return this;
    }
    @JsonProperty("reading_time_minutes")
    public Integer readingTimeMinutes;
    public ArticleIndex withReadingTimeMinutes(Integer readingTimeMinutes) {
        this.readingTimeMinutes = readingTimeMinutes;
        return this;
    }
    @JsonProperty("slug")
    public String slug;
    public ArticleIndex withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    @JsonProperty("social_image")
    public String socialImage;
    public ArticleIndex withSocialImage(String socialImage) {
        this.socialImage = socialImage;
        return this;
    }
    @JsonProperty("tag_list")
    public String[] tagList;
    public ArticleIndex withTagList(String[] tagList) {
        this.tagList = tagList;
        return this;
    }
    @JsonProperty("tags")
    public String tags;
    public ArticleIndex withTags(String tags) {
        this.tags = tags;
        return this;
    }
    @JsonProperty("title")
    public String title;
    public ArticleIndex withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonProperty("type_of")
    public String typeOf;
    public ArticleIndex withTypeOf(String typeOf) {
        this.typeOf = typeOf;
        return this;
    }
    @JsonProperty("url")
    public String url;
    public ArticleIndex withUrl(String url) {
        this.url = url;
        return this;
    }
    @JsonProperty("user")
    public SharedUser user;
    public ArticleIndex withUser(SharedUser user) {
        this.user = user;
        return this;
    }
}