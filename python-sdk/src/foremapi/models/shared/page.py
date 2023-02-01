import dataclasses
from typing import Any,Optional
from enum import Enum
from dataclasses_json import dataclass_json
from foremapi import utils

class PageTemplateEnum(str, Enum):
    CONTAINED = "contained"
    FULL_WITHIN_LAYOUT = "full_within_layout"
    NAV_BAR_INCLUDED = "nav_bar_included"
    JSON = "json"


@dataclass_json
@dataclasses.dataclass
class Page:
    r"""Page
    Representation of a page object
    """
    
    description: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    slug: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('slug') }})
    template: PageTemplateEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('template') }})
    title: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('title') }})
    body_json: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('body_json') }})
    body_markdown: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('body_markdown') }})
    is_top_level_path: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('is_top_level_path') }})
    social_image: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('social_image') }})
    
