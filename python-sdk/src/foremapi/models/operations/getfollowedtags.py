import dataclasses
from typing import Optional
from ..shared import followedtag as shared_followedtag


@dataclasses.dataclass
class GetFollowedTagsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    followed_tags: Optional[list[shared_followedtag.FollowedTag]] = dataclasses.field(default=None)
    
