package operations

type PostAPIDisplayAdsRequestBodyDisplayToEnum string

const (
	PostAPIDisplayAdsRequestBodyDisplayToEnumAll       PostAPIDisplayAdsRequestBodyDisplayToEnum = "all"
	PostAPIDisplayAdsRequestBodyDisplayToEnumLoggedIn  PostAPIDisplayAdsRequestBodyDisplayToEnum = "logged_in"
	PostAPIDisplayAdsRequestBodyDisplayToEnumLoggedOut PostAPIDisplayAdsRequestBodyDisplayToEnum = "logged_out"
)

type PostAPIDisplayAdsRequestBodyPlacementAreaEnum string

const (
	PostAPIDisplayAdsRequestBodyPlacementAreaEnumSidebarLeft  PostAPIDisplayAdsRequestBodyPlacementAreaEnum = "sidebar_left"
	PostAPIDisplayAdsRequestBodyPlacementAreaEnumSidebarLeft2 PostAPIDisplayAdsRequestBodyPlacementAreaEnum = "sidebar_left_2"
	PostAPIDisplayAdsRequestBodyPlacementAreaEnumSidebarRight PostAPIDisplayAdsRequestBodyPlacementAreaEnum = "sidebar_right"
	PostAPIDisplayAdsRequestBodyPlacementAreaEnumPostSidebar  PostAPIDisplayAdsRequestBodyPlacementAreaEnum = "post_sidebar"
	PostAPIDisplayAdsRequestBodyPlacementAreaEnumPostComments PostAPIDisplayAdsRequestBodyPlacementAreaEnum = "post_comments"
)

type PostAPIDisplayAdsRequestBody struct {
	Approved       *bool                                         `json:"approved,omitempty"`
	BodyMarkdown   string                                        `json:"body_markdown"`
	DisplayTo      *PostAPIDisplayAdsRequestBodyDisplayToEnum    `json:"display_to,omitempty"`
	Name           string                                        `json:"name"`
	OrganizationID *int64                                        `json:"organization_id,omitempty"`
	PlacementArea  PostAPIDisplayAdsRequestBodyPlacementAreaEnum `json:"placement_area"`
	Published      *bool                                         `json:"published,omitempty"`
	TagList        *string                                       `json:"tag_list,omitempty"`
}

type PostAPIDisplayAdsRequest struct {
	Request *PostAPIDisplayAdsRequestBody `request:"mediaType=application/json"`
}

type PostAPIDisplayAdsResponse struct {
	ContentType string
	StatusCode  int64
}
