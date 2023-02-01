import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// FollowedTag
/** 
 * Representation of a followed tag
**/
export class FollowedTag extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: number;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=points" })
  points: number;
}
