import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class PutApiDisplayAdsIdUnpublishPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class PutApiDisplayAdsIdUnpublishRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: PutApiDisplayAdsIdUnpublishPathParams;
}


export class PutApiDisplayAdsIdUnpublishResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
