import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PageTemplateEnum {
    Contained = "contained",
    FullWithinLayout = "full_within_layout",
    NavBarIncluded = "nav_bar_included",
    Json = "json"
}


// Page
/** 
 * Representation of a page object
**/
export class Page extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=body_json" })
  bodyJson?: string;

  @SpeakeasyMetadata({ data: "json, name=body_markdown" })
  bodyMarkdown?: string;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description: string;

  @SpeakeasyMetadata({ data: "json, name=is_top_level_path" })
  isTopLevelPath?: boolean;

  @SpeakeasyMetadata({ data: "json, name=slug" })
  slug: string;

  @SpeakeasyMetadata({ data: "json, name=social_image" })
  socialImage?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=template" })
  template: PageTemplateEnum;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title: string;
}
