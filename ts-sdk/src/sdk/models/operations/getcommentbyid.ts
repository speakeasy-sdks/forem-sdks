import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetCommentByIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class GetCommentByIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetCommentByIdPathParams;
}


export class GetCommentByIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
