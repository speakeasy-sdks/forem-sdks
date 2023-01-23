package operations

type UnpublishUserPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type UnpublishUserRequest struct {
	PathParams UnpublishUserPathParams
}

type UnpublishUserResponse struct {
	ContentType string
	StatusCode  int64
}
