package forem

import (
	"context"
	"fmt"
	"net/http"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"strings"
)

type PodcastEpisodes struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewPodcastEpisodes(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *PodcastEpisodes {
	return &PodcastEpisodes{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetPodcastEpisodes - Podcast Episodes
// This endpoint allows the client to retrieve a list of podcast episodes.
//
//	"Podcast episodes" are episodes belonging to podcasts.
//	It will only return active (reachable) podcast episodes that belong to published podcasts available on the platform, ordered by descending publication date.
//	It supports pagination, each page will contain 30 articles by default.
func (s *PodcastEpisodes) GetPodcastEpisodes(ctx context.Context, request operations.GetPodcastEpisodesRequest) (*operations.GetPodcastEpisodesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/podcast_episodes"

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

	utils.PopulateQueryParams(ctx, req, request.QueryParams)

	client := s._securityClient

	httpRes, err := client.Do(req)
	if err != nil {
		return nil, fmt.Errorf("error sending request: %w", err)
	}
	defer httpRes.Body.Close()

	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.GetPodcastEpisodesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.PodcastEpisodeIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.PodcastEpisodeIndices = out
		}
	case httpRes.StatusCode == 404:
	}

	return res, nil
}
