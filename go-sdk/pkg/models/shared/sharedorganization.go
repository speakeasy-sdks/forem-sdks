package shared

// SharedOrganization
// The organization the resource belongs to
type SharedOrganization struct {
	Name           *string `json:"name,omitempty"`
	ProfileImage   *string `json:"profile_image,omitempty"`
	ProfileImage90 *string `json:"profile_image_90,omitempty"`
	Slug           *string `json:"slug,omitempty"`
	Username       *string `json:"username,omitempty"`
}
