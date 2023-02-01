import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// Comment
/** 
 * A Comment on an Article or Podcast Episode
**/
export class Comment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id_code" })
  idCode?: string;

  @SpeakeasyMetadata({ data: "json, name=image_url" })
  imageUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=type_of" })
  typeOf?: string;
}
