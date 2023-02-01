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

type Comments struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewComments(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Comments {
	return &Comments{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetCommentByID - Comment by id
// This endpoint allows the client to retrieve a comment as well as his descendants comments.
//
//	It will return the required comment (the root) with its nested descendants as a thread.
//
//	See the format specification for further details.
func (s *Comments) GetCommentByID(ctx context.Context, request operations.GetCommentByIDRequest) (*operations.GetCommentByIDResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/comments/{id}", request.PathParams)

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

	res := &operations.GetCommentByIDResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
	case httpRes.StatusCode == 404:
	}

	return res, nil
}

// GetCommentsByArticleID - Comments
// This endpoint allows the client to retrieve all comments belonging to an article or podcast episode as threaded conversations.
//
// It will return the all top level comments with their nested comments as threads. See the format specification for further details.
func (s *Comments) GetCommentsByArticleID(ctx context.Context, request operations.GetCommentsByArticleIDRequest) (*operations.GetCommentsByArticleIDResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/comments"

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

	res := &operations.GetCommentsByArticleIDResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.Comment
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.Comments = out
		}
	case httpRes.StatusCode == 404:
	}

	return res, nil
}
