import dataclasses
from typing import Any,Optional


@dataclasses.dataclass
class GetProfileImagePathParams:
    username: str = dataclasses.field(metadata={'path_param': { 'field_name': 'username', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetProfileImageRequest:
    path_params: GetProfileImagePathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetProfileImageResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_profile_image_200_application_json_object: Optional[dict[str, Any]] = dataclasses.field(default=None)
    
