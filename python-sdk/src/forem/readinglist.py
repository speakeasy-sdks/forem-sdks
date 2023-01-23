import requests
from typing import Optional
from forem.models import shared, operations
from . import utils

class Readinglist:
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

    
    def get_readinglist(self, request: operations.GetReadinglistRequest) -> operations.GetReadinglistResponse:
        r"""Readinglist
        This endpoint allows the client to retrieve a list of articles that were saved to a Users readinglist.
                It supports pagination, each page will contain `30` articles by default
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/readinglist"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetReadinglistResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out
        elif r.status_code == 401:
            pass

        return res

    