<!-- Start SDK Example Usage -->
```go
package main

import (
    "openapi"
    "openapi/pkg/models/shared"
    "openapi/pkg/models/operations"
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
    
    req := operations.GetArticlesRequest{
        QueryParams: operations.GetArticlesQueryParams{
            CollectionID: 8717895732742165505,
            Page: 2259404117704393152,
            PerPage: 6050128673802995827,
            State: "rising",
            Tag: "consequuntur",
            Tags: "dolor",
            TagsExclude: "expedita",
            Top: 6044372234677422456,
            Username: "fugit",
        },
    }
    
    res, err := s.Articles.GetArticles(ctx, req)
    if err != nil {
        log.Fatal(err)
    }

    if res.ArticleIndices != nil {
        // handle response
    }
```
<!-- End SDK Example Usage -->