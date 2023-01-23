package shared

// SharedPodcast
// The podcast that the resource belongs to
type SharedPodcast struct {
	ImageURL *string `json:"image_url,omitempty"`
	Slug     *string `json:"slug,omitempty"`
	Title    *string `json:"title,omitempty"`
}
