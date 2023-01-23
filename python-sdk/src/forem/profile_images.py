import requests
from typing import Any,Optional
from forem.models import operations
from . import utils

class ProfileImages:
    _client: requests.Session
    _security_client: requests.Session
    _server_url: str
    _language: str
    _sdk_version: str
    _gen_version: str

    def __init__(self, client: requests.Session, security_client: requests.Session, server_url: str, language: str, sdk_version: str, gen_version: str) -> None:
        self._client = client
        self._security_client = security_client
        self._server_url = server_url
        self._language = language
        self._sdk_version = sdk_version
        self._gen_version = gen_version

    
    def get_profile_image(self, request: operations.GetProfileImageRequest) -> operations.GetProfileImageResponse:
        r"""A Users or organizations profile image
        This endpoint allows the client to retrieve a user or organization profile image information by its
                corresponding username.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/profile_images/{username}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetProfileImageResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[dict[str, Any]])
                res.get_profile_image_200_application_json_object = out
        elif r.status_code == 404:
            pass

        return res

    