package forem

import (
	"net/http"

	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var ServerList = []string{
	"https://dev.to/api",
}

type HTTPClient interface {
	Do(req *http.Request) (*http.Response, error)
}

type Forem struct {
	Articles        *Articles
	DisplayAds      *DisplayAds
	PodcastEpisodes *PodcastEpisodes
	ProfileImages   *ProfileImages
	Reactions       *Reactions
	Readinglist     *Readinglist
	Users           *Users

	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_security       *shared.Security
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

type SDKOption func(*Forem)

func WithServerURL(serverURL string, params map[string]string) SDKOption {
	return func(sdk *Forem) {
		if params != nil {
			serverURL = utils.ReplaceParameters(serverURL, params)
		}

		sdk._serverURL = serverURL
	}
}

func WithClient(client HTTPClient) SDKOption {
	return func(sdk *Forem) {
		sdk._defaultClient = client
	}
}

func WithSecurity(security shared.Security) SDKOption {
	return func(sdk *Forem) {
		sdk._security = &security
	}
}

func New(opts ...SDKOption) *Forem {
	sdk := &Forem{
		_language:   "go",
		_sdkVersion: "",
		_genVersion: "0.20.6",
	}
	for _, opt := range opts {
		opt(sdk)
	}

	if sdk._defaultClient == nil {
		sdk._defaultClient = http.DefaultClient
	}
	if sdk._securityClient == nil {

		if sdk._security != nil {
			sdk._securityClient = utils.ConfigureSecurityClient(sdk._defaultClient, sdk._security)
		} else {
			sdk._securityClient = sdk._defaultClient
		}

	}

	if sdk._serverURL == "" {
		sdk._serverURL = ServerList[0]
	}

	sdk.Articles = NewArticles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.DisplayAds = NewDisplayAds(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.PodcastEpisodes = NewPodcastEpisodes(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ProfileImages = NewProfileImages(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Reactions = NewReactions(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Readinglist = NewReadinglist(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Users = NewUsers(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	return sdk
}
