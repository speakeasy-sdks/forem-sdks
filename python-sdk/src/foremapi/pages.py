import requests
from typing import Optional
from foremapi.models import shared, operations
from . import utils

class Pages:
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

    
    def get_api_pages(self) -> operations.GetAPIPagesResponse:
        r"""show details for all pages
        This endpoint allows the client to retrieve details for all Page objects.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/pages"
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetAPIPagesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.Page]])
                res.pages = out

        return res

    
    def get_api_pages_id_(self, request: operations.GetAPIPagesIDRequest) -> operations.GetAPIPagesIDResponse:
        r"""show details for a page
        This endpoint allows the client to retrieve details for a single Page object, specified by ID.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/pages/{id}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetAPIPagesIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.Page])
                res.page = out

        return res

    