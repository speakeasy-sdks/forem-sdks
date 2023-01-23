<!-- Start SDK Example Usage -->
```typescript
import { Forem, withSecurity} from "openapi";
import { GetArticlesRequest, GetArticlesResponse } from "openapi/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new Forem(withSecurity(
  security: {
    apiKey: {
      apiKey: "YOUR_API_KEY_HERE",
    },
  }
));
    
const req: GetArticlesRequest = {
  queryParams: {
    collectionId: 8717895732742165505,
    page: 2259404117704393152,
    perPage: 6050128673802995827,
    state: "rising",
    tag: "consequuntur",
    tags: "dolor",
    tagsExclude: "expedita",
    top: 6044372234677422456,
    username: "fugit",
  },
};

sdk.articles.getArticles(req).then((res: GetArticlesResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->