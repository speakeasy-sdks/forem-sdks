<!-- Start SDK Example Usage -->
```python
import foremapi
from foremapi.models import operations, shared

s = foremapi.ForemAPI()
s.config_security(
    security=shared.Security(
        api_key=shared.SchemeAPIKey(
            api_key="YOUR_API_KEY_HERE",
        ),
    )
)
    
req = operations.CreateArticleRequest(
    request=shared.Article(
        article=shared.ArticleArticle(
            body_markdown="sit",
            canonical_url="voluptas",
            description="culpa",
            main_image="expedita",
            organization_id=3390393562759376202,
            published=False,
            series="expedita",
            tags="voluptas",
            title="fugit",
        ),
    ),
)
    
res = s.articles.create_article(req)

if res.status_code == 200:
    # handle response
```
<!-- End SDK Example Usage -->