import dataclasses



@dataclasses.dataclass
class GetAPIDisplayAdsIDPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class GetAPIDisplayAdsIDRequest:
    path_params: GetAPIDisplayAdsIDPathParams = dataclasses.field()
    

@dataclasses.dataclass
class GetAPIDisplayAdsIDResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
