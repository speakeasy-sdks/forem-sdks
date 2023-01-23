import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PostApiDisplayAdsRequestBodyDisplayToEnum {
    All = "all",
    LoggedIn = "logged_in",
    LoggedOut = "logged_out"
}

export enum PostApiDisplayAdsRequestBodyPlacementAreaEnum {
    SidebarLeft = "sidebar_left",
    SidebarLeft2 = "sidebar_left_2",
    SidebarRight = "sidebar_right",
    PostSidebar = "post_sidebar",
    PostComments = "post_comments"
}


export class PostApiDisplayAdsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=approved" })
  approved?: boolean;

  @SpeakeasyMetadata({ data: "json, name=body_markdown" })
  bodyMarkdown: string;

  @SpeakeasyMetadata({ data: "json, name=display_to" })
  displayTo?: PostApiDisplayAdsRequestBodyDisplayToEnum;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=organization_id" })
  organizationId?: number;

  @SpeakeasyMetadata({ data: "json, name=placement_area" })
  placementArea: PostApiDisplayAdsRequestBodyPlacementAreaEnum;

  @SpeakeasyMetadata({ data: "json, name=published" })
  published?: boolean;

  @SpeakeasyMetadata({ data: "json, name=tag_list" })
  tagList?: string;
}


export class PostApiDisplayAdsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostApiDisplayAdsRequestBody;
}


export class PostApiDisplayAdsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
