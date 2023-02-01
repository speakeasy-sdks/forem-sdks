package forem

import (
	"context"
	"fmt"
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/operations"
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/utils"
	"net/http"
	"strings"
)

type FollowedTags struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewFollowedTags(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *FollowedTags {
	return &FollowedTags{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetFollowedTags - Followed Tags
// This endpoint allows the client to retrieve a list of the tags they follow.
func (s *FollowedTags) GetFollowedTags(ctx context.Context) (*operations.GetFollowedTagsResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/follows/tags"

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

	client := s._securityClient

	httpRes, err := client.Do(req)
	if err != nil {
		return nil, fmt.Errorf("error sending request: %w", err)
	}
	defer httpRes.Body.Close()

	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.GetFollowedTagsResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.FollowedTag
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.FollowedTags = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}
