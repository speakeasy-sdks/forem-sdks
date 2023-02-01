import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from dataclasses_json import dataclass_json
from foremapi import utils
from ..shared import articleflaretag as shared_articleflaretag
from ..shared import sharedorganization as shared_sharedorganization
from ..shared import shareduser as shared_shareduser


@dataclass_json
@dataclasses.dataclass
class ArticleIndex:
    r"""ArticleIndex
    Representation of an article or post returned in a list
    """
    
    canonical_url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('canonical_url') }})
    cover_image: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cover_image') }})
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    crossposted_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('crossposted_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    description: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    edited_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('edited_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    last_comment_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('last_comment_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    path: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    positive_reactions_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('positive_reactions_count') }})
    public_reactions_count: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('public_reactions_count') }})
    published_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('published_at'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    published_timestamp: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('published_timestamp'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    readable_publish_date: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('readable_publish_date') }})
    reading_time_minutes: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('reading_time_minutes') }})
    slug: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('slug') }})
    social_image: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('social_image') }})
    tag_list: list[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('tag_list') }})
    tags: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('tags') }})
    title: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('title') }})
    type_of: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type_of') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('url') }})
    user: shared_shareduser.SharedUser = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('user') }})
    flare_tag: Optional[shared_articleflaretag.ArticleFlareTag] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('flare_tag') }})
    organization: Optional[shared_sharedorganization.SharedOrganization] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('organization') }})
    
