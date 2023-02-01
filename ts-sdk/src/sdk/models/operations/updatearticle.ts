import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class UpdateArticlePathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class UpdateArticleRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: UpdateArticlePathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: shared.Article;
}


export class UpdateArticleResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
