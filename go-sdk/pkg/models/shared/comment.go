package shared

import (
	"time"
)

// Comment
// A Comment on an Article or Podcast Episode
type Comment struct {
	CreatedAt *time.Time `json:"created_at,omitempty"`
	IDCode    *string    `json:"id_code,omitempty"`
	ImageURL  *string    `json:"image_url,omitempty"`
	TypeOf    *string    `json:"type_of,omitempty"`
}
