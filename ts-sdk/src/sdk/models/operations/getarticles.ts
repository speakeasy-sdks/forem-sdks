import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class GetArticlesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=collection_id" })
  collectionId?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=page" })
  page?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=per_page" })
  perPage?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=state" })
  state?: shared.PerPageParam30to1000Enum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=tag" })
  tag?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=tags" })
  tags?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=tags_exclude" })
  tagsExclude?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=top" })
  top?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=username" })
  username?: string;
}


export class GetArticlesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: GetArticlesQueryParams;
}


export class GetArticlesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: shared.ArticleIndex })
  articleIndices?: shared.ArticleIndex[];

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
