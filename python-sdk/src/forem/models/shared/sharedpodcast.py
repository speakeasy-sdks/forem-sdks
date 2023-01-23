import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from forem import utils


@dataclass_json
@dataclasses.dataclass
class SharedPodcast:
    r"""SharedPodcast
    The podcast that the resource belongs to
    """
    
    image_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('image_url') }})
    slug: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('slug') }})
    title: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('title') }})
    
