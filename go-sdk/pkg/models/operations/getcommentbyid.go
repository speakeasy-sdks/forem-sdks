package operations

type GetCommentByIDPathParams struct {
	ID int64 `pathParam:"style=simple,explode=false,name=id"`
}

type GetCommentByIDRequest struct {
	PathParams GetCommentByIDPathParams
}

type GetCommentByIDResponse struct {
	ContentType string
	StatusCode  int64
}
