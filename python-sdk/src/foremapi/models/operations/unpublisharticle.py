import dataclasses
from typing import Optional


@dataclasses.dataclass
class UnpublishArticlePathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class UnpublishArticleQueryParams:
    note: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'note', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class UnpublishArticleRequest:
    path_params: UnpublishArticlePathParams = dataclasses.field()
    query_params: UnpublishArticleQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class UnpublishArticleResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
