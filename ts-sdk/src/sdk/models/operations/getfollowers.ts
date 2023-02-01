import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetFollowersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=page" })
  page?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=per_page" })
  perPage?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=sort" })
  sort?: string;
}


// GetFollowers200ApplicationJson
/** 
 * A follower
**/
export class GetFollowers200ApplicationJson extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: number;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=path" })
  path?: string;

  @SpeakeasyMetadata({ data: "json, name=profile_image" })
  profileImage?: string;

  @SpeakeasyMetadata({ data: "json, name=type_of" })
  typeOf?: string;

  @SpeakeasyMetadata({ data: "json, name=user_id" })
  userId?: number;
}


export class GetFollowersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: GetFollowersQueryParams;
}


export class GetFollowersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata({ elemType: GetFollowers200ApplicationJson })
  getFollowers200ApplicationJSONObjects?: GetFollowers200ApplicationJson[];
}
