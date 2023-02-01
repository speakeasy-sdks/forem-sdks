package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type UpdateArticlePathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type UpdateArticleRequest struct {
	PathParams UpdateArticlePathParams
	Request    *shared.Article `request:"mediaType=application/json"`
}

type UpdateArticleResponse struct {
	ContentType string
	StatusCode  int64
}
