import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class ArticleArticle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=body_markdown" })
  bodyMarkdown?: string;

  @SpeakeasyMetadata({ data: "json, name=canonical_url" })
  canonicalUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=main_image" })
  mainImage?: string;

  @SpeakeasyMetadata({ data: "json, name=organization_id" })
  organizationId?: number;

  @SpeakeasyMetadata({ data: "json, name=published" })
  published?: boolean;

  @SpeakeasyMetadata({ data: "json, name=series" })
  series?: string;

  @SpeakeasyMetadata({ data: "json, name=tags" })
  tags?: string;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title?: string;
}


// Article
/** 
 * Representation of an Article to be created/updated
**/
export class Article extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=article" })
  article?: ArticleArticle;
}
