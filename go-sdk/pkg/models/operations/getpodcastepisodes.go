package operations

import (
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
)

type GetPodcastEpisodesQueryParams struct {
	Page     *int32  `queryParam:"style=form,explode=true,name=page"`
	PerPage  *int32  `queryParam:"style=form,explode=true,name=per_page"`
	Username *string `queryParam:"style=form,explode=true,name=username"`
}

type GetPodcastEpisodesRequest struct {
	QueryParams GetPodcastEpisodesQueryParams
}

type GetPodcastEpisodesResponse struct {
	ContentType           string
	PodcastEpisodeIndices []shared.PodcastEpisodeIndex
	StatusCode            int64
}
