import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class GetFollowedTagsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata({ elemType: shared.FollowedTag })
  followedTags?: shared.FollowedTag[];

  @SpeakeasyMetadata()
  statusCode: number;
}
