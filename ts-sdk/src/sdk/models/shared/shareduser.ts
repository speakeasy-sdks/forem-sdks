import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SharedUser
/** 
 * The resource creator
**/
export class SharedUser extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=github_username" })
  githubUsername?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=profile_image" })
  profileImage?: string;

  @SpeakeasyMetadata({ data: "json, name=profile_image_90" })
  profileImage90?: string;

  @SpeakeasyMetadata({ data: "json, name=twitter_username" })
  twitterUsername?: string;

  @SpeakeasyMetadata({ data: "json, name=username" })
  username?: string;

  @SpeakeasyMetadata({ data: "json, name=website_url" })
  websiteUrl?: string;
}
