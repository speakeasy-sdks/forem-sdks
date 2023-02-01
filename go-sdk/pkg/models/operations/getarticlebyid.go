package operations

type GetArticleByIDPathParams struct {
	ID int64 `pathParam:"style=simple,explode=false,name=id"`
}

type GetArticleByIDRequest struct {
	PathParams GetArticleByIDPathParams
}

type GetArticleByIDResponse struct {
	ContentType                            string
	StatusCode                             int64
	GetArticleByID200ApplicationJSONObject map[string]interface{}
}
