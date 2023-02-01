import dataclasses
from typing import Any,Optional


@dataclasses.dataclass
class GetArticleByIDPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetArticleByIDRequest:
    path_params: GetArticleByIDPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetArticleByIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_article_by_id_200_application_json_object: Optional[dict[str, Any]] = dataclasses.field(default=None)
    
