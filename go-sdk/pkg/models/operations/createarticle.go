package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type CreateArticleRequest struct {
	Request *shared.Article `request:"mediaType=application/json"`
}

type CreateArticleResponse struct {
	ContentType string
	StatusCode  int64
}
