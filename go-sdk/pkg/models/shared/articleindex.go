package shared

import (
	"time"
)

// ArticleIndex
// Representation of an article or post returned in a list
type ArticleIndex struct {
	CanonicalURL           string              `json:"canonical_url"`
	CoverImage             string              `json:"cover_image"`
	CreatedAt              time.Time           `json:"created_at"`
	CrosspostedAt          time.Time           `json:"crossposted_at"`
	Description            string              `json:"description"`
	EditedAt               time.Time           `json:"edited_at"`
	FlareTag               *ArticleFlareTag    `json:"flare_tag,omitempty"`
	ID                     int32               `json:"id"`
	LastCommentAt          time.Time           `json:"last_comment_at"`
	Organization           *SharedOrganization `json:"organization,omitempty"`
	Path                   string              `json:"path"`
	PositiveReactionsCount int32               `json:"positive_reactions_count"`
	PublicReactionsCount   int32               `json:"public_reactions_count"`
	PublishedAt            time.Time           `json:"published_at"`
	PublishedTimestamp     time.Time           `json:"published_timestamp"`
	ReadablePublishDate    string              `json:"readable_publish_date"`
	ReadingTimeMinutes     int32               `json:"reading_time_minutes"`
	Slug                   string              `json:"slug"`
	SocialImage            string              `json:"social_image"`
	TagList                []string            `json:"tag_list"`
	Tags                   string              `json:"tags"`
	Title                  string              `json:"title"`
	TypeOf                 string              `json:"type_of"`
	URL                    string              `json:"url"`
	User                   SharedUser          `json:"user"`
}
