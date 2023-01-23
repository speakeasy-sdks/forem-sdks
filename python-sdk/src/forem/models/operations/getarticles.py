import dataclasses
from typing import Optional
from enum import Enum
from ..shared import perpageparam30to1000_enum as shared_perpageparam30to1000_enum
from ..shared import articleindex as shared_articleindex


@dataclasses.dataclass
class GetArticlesQueryParams:
    collection_id: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'collection_id', 'style': 'form', 'explode': True }})
    page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'page', 'style': 'form', 'explode': True }})
    per_page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'per_page', 'style': 'form', 'explode': True }})
    state: Optional[shared_perpageparam30to1000_enum.PerPageParam30to1000Enum] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'state', 'style': 'form', 'explode': True }})
    tag: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'tag', 'style': 'form', 'explode': True }})
    tags: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'tags', 'style': 'form', 'explode': True }})
    tags_exclude: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'tags_exclude', 'style': 'form', 'explode': True }})
    top: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'top', 'style': 'form', 'explode': True }})
    username: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'username', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class GetArticlesRequest:
    query_params: GetArticlesQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class GetArticlesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    article_indices: Optional[list[shared_articleindex.ArticleIndex]] = dataclasses.field(default=None)
    
