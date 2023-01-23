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

type Articles struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewArticles(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Articles {
	return &Articles{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetArticles - Published articles
// This endpoint allows the client to retrieve a list of articles.
//
// "Articles" are all the posts that users create on DEV that typically
// show up in the feed. They can be a blog post, a discussion question,
// a help thread etc. but is referred to as article within the code.
//
// By default it will return featured, published articles ordered
// by descending popularity.
//
// It supports pagination, each page will contain `30` articles by default.
func (s *Articles) GetArticles(ctx context.Context, request operations.GetArticlesRequest) (*operations.GetArticlesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/articles"

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

	res := &operations.GetArticlesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ArticleIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ArticleIndices = out
		}
	}

	return res, nil
}

// GetUserAllArticles - User's all articles
// This endpoint allows the client to retrieve a list of all articles on behalf of an authenticated user.
//
// "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
//
// It will return both published and unpublished articles with pagination.
//
// Unpublished articles will be at the top of the list in reverse chronological creation order. Published articles will follow in reverse chronological publication order.
//
// By default a page will contain 30 articles.
func (s *Articles) GetUserAllArticles(ctx context.Context, request operations.GetUserAllArticlesRequest) (*operations.GetUserAllArticlesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/articles/me/all"

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

	res := &operations.GetUserAllArticlesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ArticleIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ArticleIndices = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}

// GetUserArticles - User's articles
// This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
//
// "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
//
// Published articles will be in reverse chronological publication order.
//
// It will return published articles with pagination. By default a page will contain 30 articles.
func (s *Articles) GetUserArticles(ctx context.Context, request operations.GetUserArticlesRequest) (*operations.GetUserArticlesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/articles/me"

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

	res := &operations.GetUserArticlesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ArticleIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ArticleIndices = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}

// GetUserPublishedArticles - User's published articles
// This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
//
// "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
//
// Published articles will be in reverse chronological publication order.
//
// It will return published articles with pagination. By default a page will contain 30 articles.
func (s *Articles) GetUserPublishedArticles(ctx context.Context, request operations.GetUserPublishedArticlesRequest) (*operations.GetUserPublishedArticlesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/articles/me/published"

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

	res := &operations.GetUserPublishedArticlesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ArticleIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ArticleIndices = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}

// GetUserUnpublishedArticles - User's unpublished articles
// This endpoint allows the client to retrieve a list of unpublished articles on behalf of an authenticated user.
//
// "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
//
// Unpublished articles will be in reverse chronological creation order.
//
// It will return unpublished articles with pagination. By default a page will contain 30 articles.
func (s *Articles) GetUserUnpublishedArticles(ctx context.Context, request operations.GetUserUnpublishedArticlesRequest) (*operations.GetUserUnpublishedArticlesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/articles/me/unpublished"

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

	res := &operations.GetUserUnpublishedArticlesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.ArticleIndex
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ArticleIndices = out
		}
	case httpRes.StatusCode == 401:
	}

	return res, nil
}

// UnpublishArticle - Unpublish an article
// This endpoint allows the client to unpublish an article.
//
// The user associated with the API key must have any 'admin' or 'moderator' role.
//
// The article will be unpublished and will no longer be visible to the public. It will remain
// in the database and will set back to draft status on the author's posts dashboard. Any
// notifications associated with the article will be deleted. Any comments on the article
// will remain.
func (s *Articles) UnpublishArticle(ctx context.Context, request operations.UnpublishArticleRequest) (*operations.UnpublishArticleResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/articles/{id}/unpublish", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "PUT", url, nil)
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

	res := &operations.UnpublishArticleResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 204:
	case httpRes.StatusCode == 401:
	case httpRes.StatusCode == 404:
	}

	return res, nil
}
