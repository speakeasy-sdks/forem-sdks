package operations

import (
	"openapi/pkg/models/shared"
)

type GetUserAllArticlesQueryParams struct {
	Page    *int32 `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32 `queryParam:"style=form,explode=true,name=per_page"`
}

type GetUserAllArticlesRequest struct {
	QueryParams GetUserAllArticlesQueryParams
}

type GetUserAllArticlesResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
