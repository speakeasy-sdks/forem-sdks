import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from ..shared import article as shared_article


@dataclasses.dataclass
class UpdateArticlePathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class UpdateArticleRequest:
    path_params: UpdateArticlePathParams = dataclasses.field()
    request: Optional[shared_article.Article] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    

@dataclasses.dataclass
class UpdateArticleResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
