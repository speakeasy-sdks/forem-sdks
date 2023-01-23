import dataclasses
from enum import Enum

class PostAPIReactionsCategoryEnum(str, Enum):
    LIKE = "like"
    READINGLIST = "readinglist"
    UNICORN = "unicorn"

class PostAPIReactionsReactableTypeEnum(str, Enum):
    COMMENT = "Comment"
    ARTICLE = "Article"
    USER = "User"


@dataclasses.dataclass
class PostAPIReactionsQueryParams:
    category: PostAPIReactionsCategoryEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'category', 'style': 'form', 'explode': True }})
    reactable_id: int = dataclasses.field(metadata={'query_param': { 'field_name': 'reactable_id', 'style': 'form', 'explode': True }})
    reactable_type: PostAPIReactionsReactableTypeEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'reactable_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class PostAPIReactionsRequest:
    query_params: PostAPIReactionsQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class PostAPIReactionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
