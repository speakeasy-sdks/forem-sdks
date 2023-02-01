import requests
from foremapi.models import operations
from . import utils

class Reactions:
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

    
    def post_api_reactions(self, request: operations.PostAPIReactionsRequest) -> operations.PostAPIReactionsResponse:
        r"""create reaction
        This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:
                * \"Like\"ing an Article will create a new \"like\" Reaction from the user for that Articles
                * \"Like\"ing that Article a second time will return the previous \"like\"
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/reactions"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("POST", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.PostAPIReactionsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass

        return res

    
    def post_api_reactions_toggle(self, request: operations.PostAPIReactionsToggleRequest) -> operations.PostAPIReactionsToggleResponse:
        r"""toggle reaction
        This endpoint allows the client to toggle the user's reaction to a specified reactable (eg, Article, Comment, or User). For examples:
                * \"Like\"ing an Article will create a new \"like\" Reaction from the user for that Articles
                * \"Like\"ing that Article a second time will remove the \"like\" from the user
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/reactions/toggle"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("POST", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.PostAPIReactionsToggleResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass

        return res

    