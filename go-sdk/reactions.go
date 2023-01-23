package forem

import (
	"context"
	"fmt"
	"net/http"
	"openapi/pkg/models/operations"
	"openapi/pkg/utils"
	"strings"
)

type Reactions struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewReactions(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Reactions {
	return &Reactions{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// PostAPIReactions - create reaction
// This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:
//   - "Like"ing an Article will create a new "like" Reaction from the user for that Articles
//   - "Like"ing that Article a second time will return the previous "like"
func (s *Reactions) PostAPIReactions(ctx context.Context, request operations.PostAPIReactionsRequest) (*operations.PostAPIReactionsResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/reactions"

	req, err := http.NewRequestWithContext(ctx, "POST", url, nil)
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

	res := &operations.PostAPIReactionsResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
	case httpRes.StatusCode == 401:
	}

	return res, nil
}

// PostAPIReactionsToggle - toggle reaction
// This endpoint allows the client to toggle the user's reaction to a specified reactable (eg, Article, Comment, or User). For examples:
//   - "Like"ing an Article will create a new "like" Reaction from the user for that Articles
//   - "Like"ing that Article a second time will remove the "like" from the user
func (s *Reactions) PostAPIReactionsToggle(ctx context.Context, request operations.PostAPIReactionsToggleRequest) (*operations.PostAPIReactionsToggleResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/reactions/toggle"

	req, err := http.NewRequestWithContext(ctx, "POST", url, nil)
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

	res := &operations.PostAPIReactionsToggleResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
	case httpRes.StatusCode == 401:
	}

	return res, nil
}
