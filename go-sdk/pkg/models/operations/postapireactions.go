package operations

type PostAPIReactionsCategoryEnum string

const (
	PostAPIReactionsCategoryEnumLike        PostAPIReactionsCategoryEnum = "like"
	PostAPIReactionsCategoryEnumReadinglist PostAPIReactionsCategoryEnum = "readinglist"
	PostAPIReactionsCategoryEnumUnicorn     PostAPIReactionsCategoryEnum = "unicorn"
)

type PostAPIReactionsReactableTypeEnum string

const (
	PostAPIReactionsReactableTypeEnumComment PostAPIReactionsReactableTypeEnum = "Comment"
	PostAPIReactionsReactableTypeEnumArticle PostAPIReactionsReactableTypeEnum = "Article"
	PostAPIReactionsReactableTypeEnumUser    PostAPIReactionsReactableTypeEnum = "User"
)

type PostAPIReactionsQueryParams struct {
	Category      PostAPIReactionsCategoryEnum      `queryParam:"style=form,explode=true,name=category"`
	ReactableID   int32                             `queryParam:"style=form,explode=true,name=reactable_id"`
	ReactableType PostAPIReactionsReactableTypeEnum `queryParam:"style=form,explode=true,name=reactable_type"`
}

type PostAPIReactionsRequest struct {
	QueryParams PostAPIReactionsQueryParams
}

type PostAPIReactionsResponse struct {
	ContentType string
	StatusCode  int64
}
