package operations

type PostAPIReactionsToggleCategoryEnum string

const (
	PostAPIReactionsToggleCategoryEnumLike        PostAPIReactionsToggleCategoryEnum = "like"
	PostAPIReactionsToggleCategoryEnumReadinglist PostAPIReactionsToggleCategoryEnum = "readinglist"
	PostAPIReactionsToggleCategoryEnumUnicorn     PostAPIReactionsToggleCategoryEnum = "unicorn"
)

type PostAPIReactionsToggleReactableTypeEnum string

const (
	PostAPIReactionsToggleReactableTypeEnumComment PostAPIReactionsToggleReactableTypeEnum = "Comment"
	PostAPIReactionsToggleReactableTypeEnumArticle PostAPIReactionsToggleReactableTypeEnum = "Article"
	PostAPIReactionsToggleReactableTypeEnumUser    PostAPIReactionsToggleReactableTypeEnum = "User"
)

type PostAPIReactionsToggleQueryParams struct {
	Category      PostAPIReactionsToggleCategoryEnum      `queryParam:"style=form,explode=true,name=category"`
	ReactableID   int32                                   `queryParam:"style=form,explode=true,name=reactable_id"`
	ReactableType PostAPIReactionsToggleReactableTypeEnum `queryParam:"style=form,explode=true,name=reactable_type"`
}

type PostAPIReactionsToggleRequest struct {
	QueryParams PostAPIReactionsToggleQueryParams
}

type PostAPIReactionsToggleResponse struct {
	ContentType string
	StatusCode  int64
}
