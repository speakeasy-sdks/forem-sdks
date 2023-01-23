import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum PostApiReactionsToggleCategoryEnum {
    Like = "like",
    Readinglist = "readinglist",
    Unicorn = "unicorn"
}

export enum PostApiReactionsToggleReactableTypeEnum {
    Comment = "Comment",
    Article = "Article",
    User = "User"
}


export class PostApiReactionsToggleQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=category" })
  category: PostApiReactionsToggleCategoryEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=reactable_id" })
  reactableId: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=reactable_type" })
  reactableType: PostApiReactionsToggleReactableTypeEnum;
}


export class PostApiReactionsToggleRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: PostApiReactionsToggleQueryParams;
}


export class PostApiReactionsToggleResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
