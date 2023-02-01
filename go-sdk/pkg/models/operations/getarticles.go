package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetArticlesQueryParams struct {
	CollectionID *int32                           `queryParam:"style=form,explode=true,name=collection_id"`
	Page         *int32                           `queryParam:"style=form,explode=true,name=page"`
	PerPage      *int32                           `queryParam:"style=form,explode=true,name=per_page"`
	State        *shared.PerPageParam30to1000Enum `queryParam:"style=form,explode=true,name=state"`
	Tag          *string                          `queryParam:"style=form,explode=true,name=tag"`
	Tags         *string                          `queryParam:"style=form,explode=true,name=tags"`
	TagsExclude  *string                          `queryParam:"style=form,explode=true,name=tags_exclude"`
	Top          *int32                           `queryParam:"style=form,explode=true,name=top"`
	Username     *string                          `queryParam:"style=form,explode=true,name=username"`
}

type GetArticlesRequest struct {
	QueryParams GetArticlesQueryParams
}

type GetArticlesResponse struct {
	ArticleIndices []shared.ArticleIndex
	ContentType    string
	StatusCode     int64
}
