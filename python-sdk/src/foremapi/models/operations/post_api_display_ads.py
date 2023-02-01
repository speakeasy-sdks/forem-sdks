import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from foremapi import utils

class PostAPIDisplayAdsRequestBodyDisplayToEnum(str, Enum):
    ALL = "all"
    LOGGED_IN = "logged_in"
    LOGGED_OUT = "logged_out"

class PostAPIDisplayAdsRequestBodyPlacementAreaEnum(str, Enum):
    SIDEBAR_LEFT = "sidebar_left"
    SIDEBAR_LEFT_2 = "sidebar_left_2"
    SIDEBAR_RIGHT = "sidebar_right"
    POST_SIDEBAR = "post_sidebar"
    POST_COMMENTS = "post_comments"


@dataclass_json
@dataclasses.dataclass
class PostAPIDisplayAdsRequestBody:
    body_markdown: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('body_markdown') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    placement_area: PostAPIDisplayAdsRequestBodyPlacementAreaEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('placement_area') }})
    approved: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('approved') }})
    display_to: Optional[PostAPIDisplayAdsRequestBodyDisplayToEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('display_to') }})
    organization_id: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('organization_id') }})
    published: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('published') }})
    tag_list: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('tag_list') }})
    

@dataclasses.dataclass
class PostAPIDisplayAdsRequest:
    request: Optional[PostAPIDisplayAdsRequestBody] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    

@dataclasses.dataclass
class PostAPIDisplayAdsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
