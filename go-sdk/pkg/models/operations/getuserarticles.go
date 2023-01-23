package operations

import (
	"openapi/pkg/models/shared"
)

type GetUserArticlesQueryParams struct {
	Page    *int32 `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32 `queryParam:"style=form,explode=true,name=per_page"`
}

type GetUserArticlesRequest struct {
	QueryParams GetUserArticlesQueryParams
}

type GetUserArticlesResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
