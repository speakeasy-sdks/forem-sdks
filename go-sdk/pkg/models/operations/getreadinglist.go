package operations

import (
	"openapi/pkg/models/shared"
)

type GetReadinglistQueryParams struct {
	Page    *int32 `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32 `queryParam:"style=form,explode=true,name=per_page"`
}

type GetReadinglistRequest struct {
	QueryParams GetReadinglistQueryParams
}

type GetReadinglistResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
