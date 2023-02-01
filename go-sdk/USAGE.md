<!-- Start SDK Example Usage -->
```go
package main

import (
    "github.com/speakeasy-sdks/forem-sdks/go-client-sdk"
    "github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/shared"
    "github.com/speakeasy-sdks/forem-sdks/go-client-sdk/pkg/models/operations"
)

func main() {
    opts := []forem.SDKOption{
        forem.WithSecurity(
            shared.Security{
                APIKey: shared.SchemeAPIKey{
                    APIKey: "YOUR_API_KEY_HERE",
                },
            }
        ),
    }

    s := forem.New(opts...)
    
    req := operations.CreateArticleRequest{
        Request: &shared.Article{
            Article: &shared.ArticleArticle{
                BodyMarkdown: "sit",
                CanonicalURL: "voluptas",
                Description: "culpa",
                MainImage: "expedita",
                OrganizationID: 3390393562759376202,
                Published: false,
                Series: "expedita",
                Tags: "voluptas",
                Title: "fugit",
            },
        },
    }
    
    res, err := s.Articles.CreateArticle(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
```
<!-- End SDK Example Usage -->