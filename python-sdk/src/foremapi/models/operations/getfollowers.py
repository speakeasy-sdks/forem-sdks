import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from foremapi import utils


@dataclasses.dataclass
class GetFollowersQueryParams:
    page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'page', 'style': 'form', 'explode': True }})
    per_page: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'per_page', 'style': 'form', 'explode': True }})
    sort: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'sort', 'style': 'form', 'explode': True }})
    

@dataclass_json
@dataclasses.dataclass
class GetFollowers200ApplicationJSON:
    r"""GetFollowers200ApplicationJSON
    A follower
    """
    
    id: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    path: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('path') }})
    profile_image: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('profile_image') }})
    type_of: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type_of') }})
    user_id: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('user_id') }})
    

@dataclasses.dataclass
class GetFollowersRequest:
    query_params: GetFollowersQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class GetFollowersResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_followers_200_application_json_objects: Optional[list[GetFollowers200ApplicationJSON]] = dataclasses.field(default=None)
    
