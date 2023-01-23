package operations

type PutAPIDisplayAdsIDUnpublishPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type PutAPIDisplayAdsIDUnpublishRequest struct {
	PathParams PutAPIDisplayAdsIDUnpublishPathParams
}

type PutAPIDisplayAdsIDUnpublishResponse struct {
	ContentType string
	StatusCode  int64
}
