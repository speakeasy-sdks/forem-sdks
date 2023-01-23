package shared

// PodcastEpisodeIndex
// Representation of a podcast episode returned in a list
type PodcastEpisodeIndex struct {
	ClassName string        `json:"class_name"`
	ID        int32         `json:"id"`
	ImageURL  string        `json:"image_url"`
	Path      string        `json:"path"`
	Podcast   SharedPodcast `json:"podcast"`
	Title     string        `json:"title"`
	TypeOf    string        `json:"type_of"`
}
