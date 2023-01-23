import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { ArticleFlareTag } from "./articleflaretag";
import { SharedOrganization } from "./sharedorganization";
import { SharedUser } from "./shareduser";



// ArticleIndex
/** 
 * Representation of an article or post returned in a list
**/
export class ArticleIndex extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=canonical_url" })
  canonicalUrl: string;

  @SpeakeasyMetadata({ data: "json, name=cover_image" })
  coverImage: string;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=crossposted_at" })
  crosspostedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=description" })
  description: string;

  @SpeakeasyMetadata({ data: "json, name=edited_at" })
  editedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=flare_tag" })
  flareTag?: ArticleFlareTag;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: number;

  @SpeakeasyMetadata({ data: "json, name=last_comment_at" })
  lastCommentAt: Date;

  @SpeakeasyMetadata({ data: "json, name=organization" })
  organization?: SharedOrganization;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path: string;

  @SpeakeasyMetadata({ data: "json, name=positive_reactions_count" })
  positiveReactionsCount: number;

  @SpeakeasyMetadata({ data: "json, name=public_reactions_count" })
  publicReactionsCount: number;

  @SpeakeasyMetadata({ data: "json, name=published_at" })
  publishedAt: Date;

  @SpeakeasyMetadata({ data: "json, name=published_timestamp" })
  publishedTimestamp: Date;

  @SpeakeasyMetadata({ data: "json, name=readable_publish_date" })
  readablePublishDate: string;

  @SpeakeasyMetadata({ data: "json, name=reading_time_minutes" })
  readingTimeMinutes: number;

  @SpeakeasyMetadata({ data: "json, name=slug" })
  slug: string;

  @SpeakeasyMetadata({ data: "json, name=social_image" })
  socialImage: string;

  @SpeakeasyMetadata({ data: "json, name=tag_list" })
  tagList: string[];

  @SpeakeasyMetadata({ data: "json, name=tags" })
  tags: string;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title: string;

  @SpeakeasyMetadata({ data: "json, name=type_of" })
  typeOf: string;

  @SpeakeasyMetadata({ data: "json, name=url" })
  url: string;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user: SharedUser;
}
