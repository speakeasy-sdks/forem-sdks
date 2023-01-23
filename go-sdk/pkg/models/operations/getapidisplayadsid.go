package operations

type GetAPIDisplayAdsIDPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type GetAPIDisplayAdsIDRequest struct {
	PathParams GetAPIDisplayAdsIDPathParams
}

type GetAPIDisplayAdsIDResponse struct {
	ContentType string
	StatusCode  int64
}
