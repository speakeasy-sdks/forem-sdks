package operations

type UnpublishArticlePathParams struct {
	ID int32 `pathParam:"style=simple,explode=false,name=id"`
}

type UnpublishArticleQueryParams struct {
	Note *string `queryParam:"style=form,explode=true,name=note"`
}

type UnpublishArticleRequest struct {
	PathParams  UnpublishArticlePathParams
	QueryParams UnpublishArticleQueryParams
}

type UnpublishArticleResponse struct {
	ContentType string
	StatusCode  int64
}
