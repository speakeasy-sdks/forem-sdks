package shared

// FollowedTag
// Representation of a followed tag
type FollowedTag struct {
	ID     int64   `json:"id"`
	Name   string  `json:"name"`
	Points float32 `json:"points"`
}
