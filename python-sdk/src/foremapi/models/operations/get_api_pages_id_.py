import dataclasses
from typing import Optional
from ..shared import page as shared_page


@dataclasses.dataclass
class GetAPIPagesIDPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetAPIPagesIDRequest:
    path_params: GetAPIPagesIDPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetAPIPagesIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    page: Optional[shared_page.Page] = dataclasses.field(default=None)
    
