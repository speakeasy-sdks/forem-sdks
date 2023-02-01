package forem

import (
	"context"
	"fmt"
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/operations"
	"github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/utils"
	"net/http"
	"strings"
)

type Followers struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewFollowers(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Followers {
	return &Followers{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetFollowers - Followers
// This endpoint allows the client to retrieve a list of the followers they have.
//
//	"Followers" are users that are following other users on the website.
//	It supports pagination, each page will contain 80 followers by default.
func (s *Followers) GetFollowers(ctx context.Context, request operations.GetFollowersRequest) (*operations.GetFollowersResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/followers/users"

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

	res := &operations.GetFollowersResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []operations.GetFollowers200ApplicationJSON
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.GetFollowers200ApplicationJSONObjects = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}
