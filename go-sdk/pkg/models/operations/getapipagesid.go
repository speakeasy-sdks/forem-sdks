package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetAPIPagesIDPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type GetAPIPagesIDRequest struct {
	PathParams GetAPIPagesIDPathParams
}

type GetAPIPagesIDResponse struct {
	ContentType string
	Page        *shared.Page
	StatusCode  int64
}
