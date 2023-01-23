import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class GetUserPublishedArticlesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=page" })
  page?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=per_page" })
  perPage?: number;
}


export class GetUserPublishedArticlesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: GetUserPublishedArticlesQueryParams;
}


export class GetUserPublishedArticlesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: shared.ArticleIndex })
  articleIndices?: shared.ArticleIndex[];

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
