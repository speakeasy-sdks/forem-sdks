import dataclasses
from typing import Optional
from ..shared import comment as shared_comment


@dataclasses.dataclass
class GetCommentsByArticleIDQueryParams:
    a_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'a_id', 'style': 'form', 'explode': True }})
    p_id: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'p_id', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetCommentsByArticleIDRequest:
    query_params: GetCommentsByArticleIDQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class GetCommentsByArticleIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    comments: Optional[list[shared_comment.Comment]] = dataclasses.field(default=None)
    
