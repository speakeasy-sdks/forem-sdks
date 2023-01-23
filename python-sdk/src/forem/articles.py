import requests
from typing import Any,Optional
from forem.models import shared, operations
from . import utils

class Articles:
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

    
    def get_articles(self, request: operations.GetArticlesRequest) -> operations.GetArticlesResponse:
        r"""Published articles
        This endpoint allows the client to retrieve a list of articles.
        
        \"Articles\" are all the posts that users create on DEV that typically
        show up in the feed. They can be a blog post, a discussion question,
        a help thread etc. but is referred to as article within the code.
        
        By default it will return featured, published articles ordered
        by descending popularity.
        
        It supports pagination, each page will contain `30` articles by default.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/articles"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetArticlesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out

        return res

    
    def get_user_all_articles(self, request: operations.GetUserAllArticlesRequest) -> operations.GetUserAllArticlesResponse:
        r"""User's all articles
        This endpoint allows the client to retrieve a list of all articles on behalf of an authenticated user.
        
        \"Articles\" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
        
        It will return both published and unpublished articles with pagination.
        
        Unpublished articles will be at the top of the list in reverse chronological creation order. Published articles will follow in reverse chronological publication order.
        
        By default a page will contain 30 articles.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/articles/me/all"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetUserAllArticlesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out
        elif r.status_code == 401:
            pass

        return res

    
    def get_user_articles(self, request: operations.GetUserArticlesRequest) -> operations.GetUserArticlesResponse:
        r"""User's articles
        This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
        
        \"Articles\" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
        
        Published articles will be in reverse chronological publication order.
        
        It will return published articles with pagination. By default a page will contain 30 articles.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/articles/me"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetUserArticlesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out
        elif r.status_code == 401:
            pass

        return res

    
    def get_user_published_articles(self, request: operations.GetUserPublishedArticlesRequest) -> operations.GetUserPublishedArticlesResponse:
        r"""User's published articles
        This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
        
        \"Articles\" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
        
        Published articles will be in reverse chronological publication order.
        
        It will return published articles with pagination. By default a page will contain 30 articles.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/articles/me/published"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetUserPublishedArticlesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out
        elif r.status_code == 401:
            pass

        return res

    
    def get_user_unpublished_articles(self, request: operations.GetUserUnpublishedArticlesRequest) -> operations.GetUserUnpublishedArticlesResponse:
        r"""User's unpublished articles
        This endpoint allows the client to retrieve a list of unpublished articles on behalf of an authenticated user.
        
        \"Articles\" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
        
        Unpublished articles will be in reverse chronological creation order.
        
        It will return unpublished articles with pagination. By default a page will contain 30 articles.
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/articles/me/unpublished"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetUserUnpublishedArticlesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[list[shared.ArticleIndex]])
                res.article_indices = out
        elif r.status_code == 401:
            pass

        return res

    
    def unpublish_article(self, request: operations.UnpublishArticleRequest) -> operations.UnpublishArticleResponse:
        r"""Unpublish an article
        This endpoint allows the client to unpublish an article.
        
        The user associated with the API key must have any 'admin' or 'moderator' role.
        
        The article will be unpublished and will no longer be visible to the public. It will remain
        in the database and will set back to draft status on the author's posts dashboard. Any
        notifications associated with the article will be deleted. Any comments on the article
        will remain.
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/articles/{id}/unpublish", request.path_params)
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("PUT", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.UnpublishArticleResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        elif r.status_code == 401:
            pass
        elif r.status_code == 404:
            pass

        return res

    