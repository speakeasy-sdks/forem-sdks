import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from foremapi import utils


@dataclasses.dataclass
class PutAPIDisplayAdsIDPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    
class PutAPIDisplayAdsIDRequestBodyDisplayToEnum(str, Enum):
    ALL = "all"
    LOGGED_IN = "logged_in"
    LOGGED_OUT = "logged_out"

class PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum(str, Enum):
    SIDEBAR_LEFT = "sidebar_left"
    SIDEBAR_LEFT_2 = "sidebar_left_2"
    SIDEBAR_RIGHT = "sidebar_right"
    POST_SIDEBAR = "post_sidebar"
    POST_COMMENTS = "post_comments"


@dataclass_json
@dataclasses.dataclass
class PutAPIDisplayAdsIDRequestBody:
    body_markdown: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('body_markdown') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    placement_area: PutAPIDisplayAdsIDRequestBodyPlacementAreaEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('placement_area') }})
    approved: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('approved') }})
    display_to: Optional[PutAPIDisplayAdsIDRequestBodyDisplayToEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('display_to') }})
    organization_id: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('organization_id') }})
    published: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('published') }})
    tag_list: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tag_list') }})
    

@dataclasses.dataclass
class PutAPIDisplayAdsIDRequest:
    path_params: PutAPIDisplayAdsIDPathParams = dataclasses.field()
    request: Optional[PutAPIDisplayAdsIDRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    

@dataclasses.dataclass
class PutAPIDisplayAdsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
