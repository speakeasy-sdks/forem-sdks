package forem

import (
	"context"
	"fmt"
	"net/http"
	"openapi/pkg/models/operations"
	"openapi/pkg/utils"
)

type Users struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewUsers(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *Users {
	return &Users{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// GetUser - A User
// This endpoint allows the client to retrieve a single user, either by id
// or by the user's username.
//
// For complete documentation, see the v0 API docs: https://developers.forem.com/api/v0#tag/users/operation/getUser
func (s *Users) GetUser(ctx context.Context, request operations.GetUserRequest) (*operations.GetUserResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/users/{id}", request.PathParams)

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

	res := &operations.GetUserResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
	}

	return res, nil
}

// SuspendUser - Suspend a User
// This endpoint allows the client to suspend a user.
//
// The user associated with the API key must have any 'admin' or 'moderator' role.
//
// This specified user will be assigned the 'suspended' role. Suspending a user will stop the
// user from posting new posts and comments. It doesn't delete any of the user's content, just
// prevents them from creating new content while suspended. Users are not notified of their suspension
// in the UI, so if you want them to know about this, you must notify them.
func (s *Users) SuspendUser(ctx context.Context, request operations.SuspendUserRequest) (*operations.SuspendUserResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/users/{id}/suspend", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "PUT", url, nil)
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

	res := &operations.SuspendUserResponse{
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

// UnpublishUser - Unpublish a User's Articles and Comments
// This endpoint allows the client to unpublish all of the articles and
// comments created by a user.
//
// The user associated with the API key must have any 'admin' or 'moderator' role.
//
// This specified user's articles and comments will be unpublished and will no longer be
// visible to the public. They will remain in the database and will set back to draft status
// on the specified user's  dashboard. Any notifications associated with the specified user's
// articles and comments will be deleted.
//
// Note this endpoint unpublishes articles and comments asychronously: it will return a 204 NO CONTENT
// status code immediately, but the articles and comments will not be unpublished until the
// request is completed on the server.
func (s *Users) UnpublishUser(ctx context.Context, request operations.UnpublishUserRequest) (*operations.UnpublishUserResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/api/users/{id}/unpublish", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "PUT", url, nil)
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

	res := &operations.UnpublishUserResponse{
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
