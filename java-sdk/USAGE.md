<!-- Start SDK Example Usage -->
```java
package hello.world;

import .Forem;
import .models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Forem.Builder builder = Forem.builder();

            builder.setSecurity(
                new Security() {{
                    apiKey = new SchemeApiKey() {{
                        apiKey = "YOUR_API_KEY_HERE";
                    }};
                }}
            );

            Forem sdk = builder.build();

            GetArticlesRequest req = new GetArticlesRequest() {{
                queryParams = new GetArticlesQueryParams() {{
                    collectionId = 8717895732742165505;
                    page = 2259404117704393152;
                    perPage = 6050128673802995827;
                    state = "rising";
                    tag = "consequuntur";
                    tags = "dolor";
                    tagsExclude = "expedita";
                    top = 6044372234677422456;
                    username = "fugit";
                }};
            }};

            GetArticlesResponse res = sdk.articles.getArticles(req);

            if (res.articleIndices.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->