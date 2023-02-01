import requests
from typing import Optional
from foremapi.models import shared, operations
from . import utils

class Comments:
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

    
    def get_comment_by_id(self, request: operations.GetCommentByIDRequest) -> operations.GetCommentByIDResponse:
        r"""Comment by id
        This endpoint allows the client to retrieve a comment as well as his descendants comments.
        
          It will return the required comment (the root) with its nested descendants as a thread.
        
          See the format specification for further details.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/comments/{id}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetCommentByIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 404:
            pass

        return res

    
    def get_comments_by_article_id(self, request: operations.GetCommentsByArticleIDRequest) -> operations.GetCommentsByArticleIDResponse:
        r"""Comments
        This endpoint allows the client to retrieve all comments belonging to an article or podcast episode as threaded conversations.
        
        It will return the all top level comments with their nested comments as threads. See the format specification for further details.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/comments"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetCommentsByArticleIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.Comment]])
                res.comments = out
        elif r.status_code == 404:
            pass

        return res

    