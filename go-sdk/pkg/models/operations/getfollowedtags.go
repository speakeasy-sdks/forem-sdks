package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetFollowedTagsResponse struct {
	ContentType  string
	FollowedTags []shared.FollowedTag
	StatusCode   int64
}
