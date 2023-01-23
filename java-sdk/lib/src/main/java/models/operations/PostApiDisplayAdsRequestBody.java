package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class PostApiDisplayAdsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approved")
    public Boolean approved;
    public PostApiDisplayAdsRequestBody withApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }
    @JsonProperty("body_markdown")
    public String bodyMarkdown;
    public PostApiDisplayAdsRequestBody withBodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_to")
    public PostApiDisplayAdsRequestBodyDisplayToEnum displayTo;
    public PostApiDisplayAdsRequestBody withDisplayTo(PostApiDisplayAdsRequestBodyDisplayToEnum displayTo) {
        this.displayTo = displayTo;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostApiDisplayAdsRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization_id")
    public Long organizationId;
    public PostApiDisplayAdsRequestBody withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    @JsonProperty("placement_area")
    public PostApiDisplayAdsRequestBodyPlacementAreaEnum placementArea;
    public PostApiDisplayAdsRequestBody withPlacementArea(PostApiDisplayAdsRequestBodyPlacementAreaEnum placementArea) {
        this.placementArea = placementArea;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    public Boolean published;
    public PostApiDisplayAdsRequestBody withPublished(Boolean published) {
        this.published = published;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag_list")
    public String tagList;
    public PostApiDisplayAdsRequestBody withTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
}