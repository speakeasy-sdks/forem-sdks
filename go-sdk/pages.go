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

type Pages struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewPages(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Pages {
	return &Pages{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetAPIPages - show details for all pages
// This endpoint allows the client to retrieve details for all Page objects.
func (s *Pages) GetAPIPages(ctx context.Context) (*operations.GetAPIPagesResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/api/pages"

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

	res := &operations.GetAPIPagesResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out []shared.Page
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.Pages = out
		}
	}

	return res, nil
}

// GetAPIPagesID - show details for a page
// This endpoint allows the client to retrieve details for a single Page object, specified by ID.
func (s *Pages) GetAPIPagesID(ctx context.Context, request operations.GetAPIPagesIDRequest) (*operations.GetAPIPagesIDResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/pages/{id}", request.PathParams)

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

	res := &operations.GetAPIPagesIDResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.Page
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.Page = out
		}
	}

	return res, nil
}
