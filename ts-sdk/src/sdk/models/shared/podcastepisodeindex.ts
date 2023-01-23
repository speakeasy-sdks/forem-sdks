import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { SharedPodcast } from "./sharedpodcast";



// PodcastEpisodeIndex
/** 
 * Representation of a podcast episode returned in a list
**/
export class PodcastEpisodeIndex extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=class_name" })
  className: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: number;

  @SpeakeasyMetadata({ data: "json, name=image_url" })
  imageUrl: string;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path: string;

  @SpeakeasyMetadata({ data: "json, name=podcast" })
  podcast: SharedPodcast;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title: string;

  @SpeakeasyMetadata({ data: "json, name=type_of" })
  typeOf: string;
}
