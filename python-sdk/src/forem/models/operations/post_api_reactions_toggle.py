import dataclasses
from enum import Enum

class PostAPIReactionsToggleCategoryEnum(str, Enum):
    LIKE = "like"
    READINGLIST = "readinglist"
    UNICORN = "unicorn"

class PostAPIReactionsToggleReactableTypeEnum(str, Enum):
    COMMENT = "Comment"
    ARTICLE = "Article"
    USER = "User"


@dataclasses.dataclass
class PostAPIReactionsToggleQueryParams:
    category: PostAPIReactionsToggleCategoryEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'category', 'style': 'form', 'explode': True }})
    reactable_id: int = dataclasses.field(metadata={'query_param': { 'field_name': 'reactable_id', 'style': 'form', 'explode': True }})
    reactable_type: PostAPIReactionsToggleReactableTypeEnum = dataclasses.field(metadata={'query_param': { 'field_name': 'reactable_type', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class PostAPIReactionsToggleRequest:
    query_params: PostAPIReactionsToggleQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class PostAPIReactionsToggleResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
