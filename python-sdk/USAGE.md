<!-- Start SDK Example Usage -->
```python
import forem
from forem.models import operations, shared

s = forem.Forem()
s.config_security(
    security=shared.Security(
        api_key=shared.SchemeAPIKey(
            api_key="YOUR_API_KEY_HERE",
        ),
    )
)
    
req = operations.GetArticlesRequest(
    query_params=operations.GetArticlesQueryParams(
        collection_id=8717895732742165505,
        page=2259404117704393152,
        per_page=6050128673802995827,
        state="rising",
        tag="consequuntur",
        tags="dolor",
        tags_exclude="expedita",
        top=6044372234677422456,
        username="fugit",
    ),
)
    
res = s.articles.get_articles(req)

if res.article_indices is not None:
    # handle response
```
<!-- End SDK Example Usage -->