import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class UnpublishArticlePathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=id" })
  id: number;
}


export class UnpublishArticleQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=note" })
  note?: string;
}


export class UnpublishArticleRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: UnpublishArticlePathParams;

  @SpeakeasyMetadata()
  queryParams: UnpublishArticleQueryParams;
}


export class UnpublishArticleResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
