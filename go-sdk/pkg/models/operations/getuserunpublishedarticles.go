package operations

import (
	"openapi/pkg/models/shared"
)

type GetUserUnpublishedArticlesQueryParams struct {
	Page    *int32 `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32 `queryParam:"style=form,explode=true,name=per_page"`
}

type GetUserUnpublishedArticlesRequest struct {
	QueryParams GetUserUnpublishedArticlesQueryParams
}

type GetUserUnpublishedArticlesResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
