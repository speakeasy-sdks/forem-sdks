import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class SuspendUserPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class SuspendUserRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: SuspendUserPathParams;
}


export class SuspendUserResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
