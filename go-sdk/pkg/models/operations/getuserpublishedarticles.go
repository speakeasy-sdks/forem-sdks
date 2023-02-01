package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetUserPublishedArticlesQueryParams struct {
	Page    *int32 `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32 `queryParam:"style=form,explode=true,name=per_page"`
}

type GetUserPublishedArticlesRequest struct {
	QueryParams GetUserPublishedArticlesQueryParams
}

type GetUserPublishedArticlesResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
