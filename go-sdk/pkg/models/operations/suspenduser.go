package operations

type SuspendUserPathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type SuspendUserRequest struct {
	PathParams SuspendUserPathParams
}

type SuspendUserResponse struct {
	ContentType string
	StatusCode  int64
}
