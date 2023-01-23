import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetProfileImagePathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=username" })
  username: string;
}


export class GetProfileImageRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetProfileImagePathParams;
}


export class GetProfileImageResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getProfileImage200ApplicationJSONObject?: Record<string, any>;
}
