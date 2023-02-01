package operations

type PostAPIReactionsToggleCategoryEnum string

const (
	PostAPIReactionsToggleCategoryEnumLike          PostAPIReactionsToggleCategoryEnum = "like"
	PostAPIReactionsToggleCategoryEnumUnicorn       PostAPIReactionsToggleCategoryEnum = "unicorn"
	PostAPIReactionsToggleCategoryEnumExplodingHead PostAPIReactionsToggleCategoryEnum = "exploding-head"
	PostAPIReactionsToggleCategoryEnumRaisedHands   PostAPIReactionsToggleCategoryEnum = "raised_hands"
	PostAPIReactionsToggleCategoryEnumFire          PostAPIReactionsToggleCategoryEnum = "fire"
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
