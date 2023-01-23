import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// ArticleFlareTag
/** 
 * Flare tag of the article
**/
export class ArticleFlareTag extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=bg_color_hex" })
  bgColorHex?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=text_color_hex" })
  textColorHex?: string;
}
