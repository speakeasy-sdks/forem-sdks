import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class GetCommentsByArticleIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=a_id" })
  aId?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=p_id" })
  pId?: string;
}


export class GetCommentsByArticleIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: GetCommentsByArticleIdQueryParams;
}


export class GetCommentsByArticleIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: shared.Comment })
  comments?: shared.Comment[];

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
