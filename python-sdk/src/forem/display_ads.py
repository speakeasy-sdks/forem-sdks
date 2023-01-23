import requests
from forem.models import operations
from . import utils

class DisplayAds:
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

    
    def get_api_display_ads(self) -> operations.GetAPIDisplayAdsResponse:
        r"""display ads
        This endpoint allows the client to retrieve a list of all display ads.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/display_ads"
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetAPIDisplayAdsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass

        return res

    
    def get_api_display_ads_id_(self, request: operations.GetAPIDisplayAdsIDRequest) -> operations.GetAPIDisplayAdsIDResponse:
        r"""display ad
        This endpoint allows the client to retrieve a single display ad, via its id.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/display_ads/{id}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetAPIDisplayAdsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    
    def post_api_display_ads(self, request: operations.PostAPIDisplayAdsRequest) -> operations.PostAPIDisplayAdsResponse:
        r"""display ads
        This endpoint allows the client to create a new display ad.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/display_ads"
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, json=json, files=files, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.PostAPIDisplayAdsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 422:
            pass

        return res

    
    def put_api_display_ads_id_(self, request: operations.PutAPIDisplayAdsIDRequest) -> operations.PutAPIDisplayAdsIDResponse:
        r"""display ads
        This endpoint allows the client to update the attributes of a single display ad, via its id.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/display_ads/{id}", request.path_params)
        
        headers = {}
        req_content_type, data, json, files = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("PUT", url, data=data, json=json, files=files, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.PutAPIDisplayAdsIDResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    
    def put_api_display_ads_id_unpublish(self, request: operations.PutAPIDisplayAdsIDUnpublishRequest) -> operations.PutAPIDisplayAdsIDUnpublishResponse:
        r"""unpublish
        This endpoint allows the client to remove a display ad from rotation by un-publishing it.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/display_ads/{id}/unpublish", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("PUT", url)
        content_type = r.headers.get("Content-Type")

        res = operations.PutAPIDisplayAdsIDUnpublishResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    