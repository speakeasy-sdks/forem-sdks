import dataclasses



@dataclasses.dataclass
class GetUserPathParams:
    id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetUserRequest:
    path_params: GetUserPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetUserResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
