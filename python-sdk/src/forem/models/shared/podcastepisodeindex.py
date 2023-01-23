import dataclasses
from dataclasses_json import dataclass_json
from forem import utils
from ..shared import sharedpodcast as shared_sharedpodcast


@dataclass_json
@dataclasses.dataclass
class PodcastEpisodeIndex:
    r"""PodcastEpisodeIndex
    Representation of a podcast episode returned in a list
    """
    
    class_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('class_name') }})
    id: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    image_url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('image_url') }})
    path: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    podcast: shared_sharedpodcast.SharedPodcast = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('podcast') }})
    title: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('title') }})
    type_of: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type_of') }})
    
