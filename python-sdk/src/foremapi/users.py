import requests
from typing import Any
from foremapi.models import operations
from . import utils

class Users:
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

    
    def get_user(self, request: operations.GetUserRequest) -> operations.GetUserResponse:
        r"""A User
        This endpoint allows the client to retrieve a single user, either by id
        or by the user's username.
        
        For complete documentation, see the v0 API docs: https://developers.forem.com/api/v0#tag/users/operation/getUser
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/users/{id}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetUserResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass

        return res

    
    def suspend_user(self, request: operations.SuspendUserRequest) -> operations.SuspendUserResponse:
        r"""Suspend a User
        This endpoint allows the client to suspend a user.
        
        The user associated with the API key must have any 'admin' or 'moderator' role.
        
        This specified user will be assigned the 'suspended' role. Suspending a user will stop the
        user from posting new posts and comments. It doesn't delete any of the user's content, just
        prevents them from creating new content while suspended. Users are not notified of their suspension
        in the UI, so if you want them to know about this, you must notify them.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/users/{id}/suspend", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("PUT", url)
        content_type = r.headers.get("Content-Type")

        res = operations.SuspendUserResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    
    def unpublish_user(self, request: operations.UnpublishUserRequest) -> operations.UnpublishUserResponse:
        r"""Unpublish a User's Articles and Comments
        This endpoint allows the client to unpublish all of the articles and
        comments created by a user.
        
        The user associated with the API key must have any 'admin' or 'moderator' role.
        
        This specified user's articles and comments will be unpublished and will no longer be
        visible to the public. They will remain in the database and will set back to draft status
        on the specified user's  dashboard. Any notifications associated with the specified user's
        articles and comments will be deleted.
        
        Note this endpoint unpublishes articles and comments asychronously: it will return a 204 NO CONTENT
        status code immediately, but the articles and comments will not be unpublished until the
        request is completed on the server.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/users/{id}/unpublish", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("PUT", url)
        content_type = r.headers.get("Content-Type")

        res = operations.UnpublishUserResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    