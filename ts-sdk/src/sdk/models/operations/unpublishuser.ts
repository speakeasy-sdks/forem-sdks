import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class UnpublishUserPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class UnpublishUserRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: UnpublishUserPathParams;
}


export class UnpublishUserResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
