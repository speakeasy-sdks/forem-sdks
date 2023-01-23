import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetApiDisplayAdsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class GetApiDisplayAdsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetApiDisplayAdsIdPathParams;
}


export class GetApiDisplayAdsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
