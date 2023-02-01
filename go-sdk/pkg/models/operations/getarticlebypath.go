package operations

type GetArticleByPathPathParams struct {
	Slug     string `pathParam:"style=simple,explode=false,name=slug"`
	Username string `pathParam:"style=simple,explode=false,name=username"`
}

type GetArticleByPathRequest struct {
	PathParams GetArticleByPathPathParams
}

type GetArticleByPathResponse struct {
	ContentType                              string
	StatusCode                               int64
	GetArticleByPath200ApplicationJSONObject map[string]interface{}
}
