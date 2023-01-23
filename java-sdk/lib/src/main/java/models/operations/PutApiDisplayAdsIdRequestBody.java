package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class PutApiDisplayAdsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approved")
    public Boolean approved;
    public PutApiDisplayAdsIdRequestBody withApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }
    @JsonProperty("body_markdown")
    public String bodyMarkdown;
    public PutApiDisplayAdsIdRequestBody withBodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_to")
    public PutApiDisplayAdsIdRequestBodyDisplayToEnum displayTo;
    public PutApiDisplayAdsIdRequestBody withDisplayTo(PutApiDisplayAdsIdRequestBodyDisplayToEnum displayTo) {
        this.displayTo = displayTo;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PutApiDisplayAdsIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization_id")
    public Long organizationId;
    public PutApiDisplayAdsIdRequestBody withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    @JsonProperty("placement_area")
    public PutApiDisplayAdsIdRequestBodyPlacementAreaEnum placementArea;
    public PutApiDisplayAdsIdRequestBody withPlacementArea(PutApiDisplayAdsIdRequestBodyPlacementAreaEnum placementArea) {
        this.placementArea = placementArea;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published")
    public Boolean published;
    public PutApiDisplayAdsIdRequestBody withPublished(Boolean published) {
        this.published = published;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag_list")
    public String tagList;
    public PutApiDisplayAdsIdRequestBody withTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
}