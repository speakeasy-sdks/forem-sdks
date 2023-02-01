<!-- Start SDK Example Usage -->
```typescript
import { ForemApi, withSecurity} from "@forem/sdk";
import { CreateArticleRequest, CreateArticleResponse } from "@forem/sdk/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new ForemApi(withSecurity(
  security: {
    apiKey: {
      apiKey: "YOUR_API_KEY_HERE",
    },
  }
));
    
const req: CreateArticleRequest = {
  request: {
    article: {
      bodyMarkdown: "sit",
      canonicalUrl: "voluptas",
      description: "culpa",
      mainImage: "expedita",
      organizationId: 3390393562759376202,
      published: false,
      series: "expedita",
      tags: "voluptas",
      title: "fugit",
    },
  },
};

sdk.articles.createArticle(req).then((res: CreateArticleResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->