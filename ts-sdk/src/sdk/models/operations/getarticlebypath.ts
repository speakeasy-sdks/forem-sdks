import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class GetArticleByPathPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=slug" })
  slug: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=username" })
  username: string;
}


export class GetArticleByPathRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetArticleByPathPathParams;
}


export class GetArticleByPathResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  getArticleByPath200ApplicationJSONObject?: Record<string, any>;
}
