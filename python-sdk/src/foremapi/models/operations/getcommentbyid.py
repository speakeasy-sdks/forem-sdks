import dataclasses



@dataclasses.dataclass
class GetCommentByIDPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetCommentByIDRequest:
    path_params: GetCommentByIDPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetCommentByIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
