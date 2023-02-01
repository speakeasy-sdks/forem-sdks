import dataclasses
from typing import Optional
from ..shared import page as shared_page


@dataclasses.dataclass
class GetAPIPagesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    pages: Optional[list[shared_page.Page]] = dataclasses.field(default=None)
    
