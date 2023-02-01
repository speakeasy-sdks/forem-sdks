import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from foremapi import utils


@dataclass_json
@dataclasses.dataclass
class ArticleFlareTag:
    r"""ArticleFlareTag
    Flare tag of the article
    """
    
    bg_color_hex: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('bg_color_hex') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    text_color_hex: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text_color_hex') }})
    
