import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetArticleByIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class GetArticleByIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetArticleByIdPathParams;
}


export class GetArticleByIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getArticleById200ApplicationJSONObject?: Record<string, any>;
}
