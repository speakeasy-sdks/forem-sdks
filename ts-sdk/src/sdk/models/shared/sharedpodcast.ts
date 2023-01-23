import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SharedPodcast
/** 
 * The podcast that the resource belongs to
**/
export class SharedPodcast extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=image_url" })
  imageUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=slug" })
  slug?: string;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title?: string;
}
