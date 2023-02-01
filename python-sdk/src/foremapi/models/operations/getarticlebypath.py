import dataclasses
from typing import Any,Optional


@dataclasses.dataclass
class GetArticleByPathPathParams:
    slug: str = dataclasses.field(metadata={'path_param': { 'field_name': 'slug', 'style': 'simple', 'explode': False }})
    username: str = dataclasses.field(metadata={'path_param': { 'field_name': 'username', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetArticleByPathRequest:
    path_params: GetArticleByPathPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetArticleByPathResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_article_by_path_200_application_json_object: Optional[dict[str, Any]] = dataclasses.field(default=None)
    
