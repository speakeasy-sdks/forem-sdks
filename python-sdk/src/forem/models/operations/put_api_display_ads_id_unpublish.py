import dataclasses



@dataclasses.dataclass
class PutAPIDisplayAdsIDUnpublishPathParams:
    id: int = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class PutAPIDisplayAdsIDUnpublishRequest:
    path_params: PutAPIDisplayAdsIDUnpublishPathParams = dataclasses.field()
    

@dataclasses.dataclass
class PutAPIDisplayAdsIDUnpublishResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
