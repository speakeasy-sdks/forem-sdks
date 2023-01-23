import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SharedOrganization
/** 
 * The organization the resource belongs to
**/
export class SharedOrganization extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=profile_image" })
  profileImage?: string;

  @SpeakeasyMetadata({ data: "json, name=profile_image_90" })
  profileImage90?: string;

  @SpeakeasyMetadata({ data: "json, name=slug" })
  slug?: string;

  @SpeakeasyMetadata({ data: "json, name=username" })
  username?: string;
}
