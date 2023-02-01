package shared

type PageTemplateEnum string

const (
	PageTemplateEnumContained        PageTemplateEnum = "contained"
	PageTemplateEnumFullWithinLayout PageTemplateEnum = "full_within_layout"
	PageTemplateEnumNavBarIncluded   PageTemplateEnum = "nav_bar_included"
	PageTemplateEnumJSON             PageTemplateEnum = "json"
)

// Page
// Representation of a page object
type Page struct {
	BodyJSON       *string                `json:"body_json,omitempty"`
	BodyMarkdown   *string                `json:"body_markdown,omitempty"`
	Description    string                 `json:"description"`
	IsTopLevelPath *bool                  `json:"is_top_level_path,omitempty"`
	Slug           string                 `json:"slug"`
	SocialImage    map[string]interface{} `json:"social_image,omitempty"`
	Template       PageTemplateEnum       `json:"template"`
	Title          string                 `json:"title"`
}
