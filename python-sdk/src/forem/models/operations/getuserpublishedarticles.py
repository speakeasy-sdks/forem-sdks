import dataclasses
from typing import Optional
from ..shared import articleindex as shared_articleindex


@dataclasses.dataclass
class GetUserPublishedArticlesQueryParams:
    page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'page', 'style': 'form', 'explode': True }})
    per_page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'per_page', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetUserPublishedArticlesRequest:
    query_params: GetUserPublishedArticlesQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class GetUserPublishedArticlesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    article_indices: Optional[list[shared_articleindex.ArticleIndex]] = dataclasses.field(default=None)
    
