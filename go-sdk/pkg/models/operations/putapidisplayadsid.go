package operations

type PutAPIDisplayAdsIDPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type PutAPIDisplayAdsIDRequestBodyDisplayToEnum string

const (
	PutAPIDisplayAdsIDRequestBodyDisplayToEnumAll       PutAPIDisplayAdsIDRequestBodyDisplayToEnum = "all"
	PutAPIDisplayAdsIDRequestBodyDisplayToEnumLoggedIn  PutAPIDisplayAdsIDRequestBodyDisplayToEnum = "logged_in"
	PutAPIDisplayAdsIDRequestBodyDisplayToEnumLoggedOut PutAPIDisplayAdsIDRequestBodyDisplayToEnum = "logged_out"
)

type PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum string

const (
	PutAPIDisplayAdsIDRequestBodyPlacementAreaEnumSidebarLeft  PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = "sidebar_left"
	PutAPIDisplayAdsIDRequestBodyPlacementAreaEnumSidebarLeft2 PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = "sidebar_left_2"
	PutAPIDisplayAdsIDRequestBodyPlacementAreaEnumSidebarRight PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = "sidebar_right"
	PutAPIDisplayAdsIDRequestBodyPlacementAreaEnumPostSidebar  PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = "post_sidebar"
	PutAPIDisplayAdsIDRequestBodyPlacementAreaEnumPostComments PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = "post_comments"
)

type PutAPIDisplayAdsIDRequestBody struct {
	Approved       *bool                                          `json:"approved,omitempty"`
	BodyMarkdown   string                                         `json:"body_markdown"`
	DisplayTo      *PutAPIDisplayAdsIDRequestBodyDisplayToEnum    `json:"display_to,omitempty"`
	Name           string                                         `json:"name"`
	OrganizationID *int64                                         `json:"organization_id,omitempty"`
	PlacementArea  PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum `json:"placement_area"`
	Published      *bool                                          `json:"published,omitempty"`
	TagList        *string                                        `json:"tag_list,omitempty"`
}

type PutAPIDisplayAdsIDRequest struct {
	PathParams PutAPIDisplayAdsIDPathParams
	Request    *PutAPIDisplayAdsIDRequestBody `request:"mediaType=application/json"`
}

type PutAPIDisplayAdsIDResponse struct {
	ContentType string
	StatusCode  int64
}
