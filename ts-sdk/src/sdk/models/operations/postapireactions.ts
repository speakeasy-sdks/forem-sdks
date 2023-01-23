import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PostApiReactionsCategoryEnum {
    Like = "like",
    Readinglist = "readinglist",
    Unicorn = "unicorn"
}

export enum PostApiReactionsReactableTypeEnum {
    Comment = "Comment",
    Article = "Article",
    User = "User"
}


export class PostApiReactionsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=category" })
  category: PostApiReactionsCategoryEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=reactable_id" })
  reactableId: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=reactable_type" })
  reactableType: PostApiReactionsReactableTypeEnum;
}


export class PostApiReactionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: PostApiReactionsQueryParams;
}


export class PostApiReactionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
