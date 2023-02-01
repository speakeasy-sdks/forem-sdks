package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetAPIPagesResponse struct {
	ContentType string
	Pages       []shared.Page
	StatusCode  int64
}
