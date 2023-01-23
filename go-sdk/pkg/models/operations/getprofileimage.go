package operations

type GetProfileImagePathParams struct {
	Username string `pathParam:"style=simple,explode=false,name=username"`
}

type GetProfileImageRequest struct {
	PathParams GetProfileImagePathParams
}

type GetProfileImageResponse struct {
	ContentType                             string
	StatusCode                              int64
	GetProfileImage200ApplicationJSONObject map[string]interface{}
}
