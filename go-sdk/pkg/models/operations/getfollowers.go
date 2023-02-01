package operations

type GetFollowersQueryParams struct {
	Page    *int32  `queryParam:"style=form,explode=true,name=page"`
	PerPage *int32  `queryParam:"style=form,explode=true,name=per_page"`
	Sort    *string `queryParam:"style=form,explode=true,name=sort"`
}

// GetFollowers200ApplicationJSON
// A follower
type GetFollowers200ApplicationJSON struct {
	ID           *int32  `json:"id,omitempty"`
	Name         *string `json:"name,omitempty"`
	Path         *string `json:"path,omitempty"`
	ProfileImage *string `json:"profile_image,omitempty"`
	TypeOf       *string `json:"type_of,omitempty"`
	UserID       *int32  `json:"user_id,omitempty"`
}

type GetFollowersRequest struct {
	QueryParams GetFollowersQueryParams
}

type GetFollowersResponse struct {
	ContentType                           string
	StatusCode                            int64
	GetFollowers200ApplicationJSONObjects []GetFollowers200ApplicationJSON
}
