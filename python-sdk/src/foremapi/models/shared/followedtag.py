import dataclasses
from dataclasses_json import dataclass_json
from foremapi import utils


@dataclass_json
@dataclasses.dataclass
class FollowedTag:
    r"""FollowedTag
    Representation of a followed tag
    """
    
    id: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    points: float = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('points') }})
    
