package shared

// SharedUser
// The resource creator
type SharedUser struct {
	GithubUsername  *string `json:"github_username,omitempty"`
	Name            *string `json:"name,omitempty"`
	ProfileImage    *string `json:"profile_image,omitempty"`
	ProfileImage90  *string `json:"profile_image_90,omitempty"`
	TwitterUsername *string `json:"twitter_username,omitempty"`
	Username        *string `json:"username,omitempty"`
	WebsiteURL      *string `json:"website_url,omitempty"`
}
