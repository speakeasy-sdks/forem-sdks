package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetCommentsByArticleIDQueryParams struct {
	AID *string `queryParam:"style=form,explode=true,name=a_id"`
	PID *string `queryParam:"style=form,explode=true,name=p_id"`
}

type GetCommentsByArticleIDRequest struct {
	QueryParams GetCommentsByArticleIDQueryParams
}

type GetCommentsByArticleIDResponse struct {
	Comments    []shared.Comment
	ContentType string
	StatusCode  int64
}
