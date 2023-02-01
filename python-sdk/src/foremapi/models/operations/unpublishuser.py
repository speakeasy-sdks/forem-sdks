import dataclasses



@dataclasses.dataclass
class UnpublishUserPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class UnpublishUserRequest:
    path_params: UnpublishUserPathParams = dataclasses.field()
    

@dataclasses.dataclass
class UnpublishUserResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
