import dataclasses
from typing import Optional
from ..shared import article as shared_article


@dataclasses.dataclass
class CreateArticleRequest:
    request: Optional[shared_article.Article] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    

@dataclasses.dataclass
class CreateArticleResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
