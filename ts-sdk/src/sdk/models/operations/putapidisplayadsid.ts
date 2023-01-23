import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class PutApiDisplayAdsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}

export enum PutApiDisplayAdsIdRequestBodyDisplayToEnum {
    All = "all",
    LoggedIn = "logged_in",
    LoggedOut = "logged_out"
}

export enum PutApiDisplayAdsIdRequestBodyPlacementAreaEnum {
    SidebarLeft = "sidebar_left",
    SidebarLeft2 = "sidebar_left_2",
    SidebarRight = "sidebar_right",
    PostSidebar = "post_sidebar",
    PostComments = "post_comments"
}


export class PutApiDisplayAdsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=approved" })
  approved?: boolean;

  @SpeakeasyMetadata({ data: "json, name=body_markdown" })
  bodyMarkdown: string;

  @SpeakeasyMetadata({ data: "json, name=display_to" })
  displayTo?: PutApiDisplayAdsIdRequestBodyDisplayToEnum;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=organization_id" })
  organizationId?: number;

  @SpeakeasyMetadata({ data: "json, name=placement_area" })
  placementArea: PutApiDisplayAdsIdRequestBodyPlacementAreaEnum;

  @SpeakeasyMetadata({ data: "json, name=published" })
  published?: boolean;

  @SpeakeasyMetadata({ data: "json, name=tag_list" })
  tagList?: string;
}


export class PutApiDisplayAdsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: PutApiDisplayAdsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutApiDisplayAdsIdRequestBody;
}


export class PutApiDisplayAdsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
