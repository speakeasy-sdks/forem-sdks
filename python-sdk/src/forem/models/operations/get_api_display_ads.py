import dataclasses



@dataclasses.dataclass
class GetAPIDisplayAdsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    
