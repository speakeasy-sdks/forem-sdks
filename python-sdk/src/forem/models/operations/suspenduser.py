import dataclasses



@dataclasses.dataclass
class SuspendUserPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class SuspendUserRequest:
    path_params: SuspendUserPathParams = dataclasses.field()
    

@dataclasses.dataclass
class SuspendUserResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
