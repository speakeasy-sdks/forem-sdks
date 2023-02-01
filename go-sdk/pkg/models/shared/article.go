package shared

type ArticleArticle struct {
	BodyMarkdown   *string `json:"body_markdown,omitempty"`
	CanonicalURL   *string `json:"canonical_url,omitempty"`
	Description    *string `json:"description,omitempty"`
	MainImage      *string `json:"main_image,omitempty"`
	OrganizationID *int64  `json:"organization_id,omitempty"`
	Published      *bool   `json:"published,omitempty"`
	Series         *string `json:"series,omitempty"`
	Tags           *string `json:"tags,omitempty"`
	Title          *string `json:"title,omitempty"`
}

// Article
// Representation of an Article to be created/updated
type Article struct {
	Article *ArticleArticle `json:"article,omitempty"`
}
