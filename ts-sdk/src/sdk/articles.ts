import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Articles {
  _defaultClient: AxiosInstance;
  _securityClient: AxiosInstance;
  _serverURL: string;
  _language: string;
  _sdkVersion: string;
  _genVersion: string;

  constructor(defaultClient: AxiosInstance, securityClient: AxiosInstance, serverURL: string, language: string, sdkVersion: string, genVersion: string) {
    this._defaultClient = defaultClient;
    this._securityClient = securityClient;
    this._serverURL = serverURL;
    this._language = language;
    this._sdkVersion = sdkVersion;
    this._genVersion = genVersion;
  }
  
  /**
   * getArticles - Published articles
   *
   * This endpoint allows the client to retrieve a list of articles.
   * 
   * "Articles" are all the posts that users create on DEV that typically
   * show up in the feed. They can be a blog post, a discussion question,
   * a help thread etc. but is referred to as article within the code.
   * 
   * By default it will return featured, published articles ordered
   * by descending popularity.
   * 
   * It supports pagination, each page will contain `30` articles by default.
  **/
  getArticles(
    req: operations.GetArticlesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetArticlesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetArticlesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/articles";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetArticlesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.articleIndices = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * getUserAllArticles - User's all articles
   *
   * This endpoint allows the client to retrieve a list of all articles on behalf of an authenticated user.
   * 
   * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
   * 
   * It will return both published and unpublished articles with pagination.
   * 
   * Unpublished articles will be at the top of the list in reverse chronological creation order. Published articles will follow in reverse chronological publication order.
   * 
   * By default a page will contain 30 articles.
  **/
  getUserAllArticles(
    req: operations.GetUserAllArticlesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetUserAllArticlesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetUserAllArticlesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/articles/me/all";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetUserAllArticlesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.articleIndices = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

  
  /**
   * getUserArticles - User's articles
   *
   * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
   * 
   * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
   * 
   * Published articles will be in reverse chronological publication order.
   * 
   * It will return published articles with pagination. By default a page will contain 30 articles.
  **/
  getUserArticles(
    req: operations.GetUserArticlesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetUserArticlesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetUserArticlesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/articles/me";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetUserArticlesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.articleIndices = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

  
  /**
   * getUserPublishedArticles - User's published articles
   *
   * This endpoint allows the client to retrieve a list of published articles on behalf of an authenticated user.
   * 
   * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
   * 
   * Published articles will be in reverse chronological publication order.
   * 
   * It will return published articles with pagination. By default a page will contain 30 articles.
  **/
  getUserPublishedArticles(
    req: operations.GetUserPublishedArticlesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetUserPublishedArticlesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetUserPublishedArticlesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/articles/me/published";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetUserPublishedArticlesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.articleIndices = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

  
  /**
   * getUserUnpublishedArticles - User's unpublished articles
   *
   * This endpoint allows the client to retrieve a list of unpublished articles on behalf of an authenticated user.
   * 
   * "Articles" are all the posts that users create on DEV that typically show up in the feed. They can be a blog post, a discussion question, a help thread etc. but is referred to as article within the code.
   * 
   * Unpublished articles will be in reverse chronological creation order.
   * 
   * It will return unpublished articles with pagination. By default a page will contain 30 articles.
  **/
  getUserUnpublishedArticles(
    req: operations.GetUserUnpublishedArticlesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetUserUnpublishedArticlesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetUserUnpublishedArticlesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/articles/me/unpublished";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetUserUnpublishedArticlesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.articleIndices = httpRes?.data;
            }
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

  
  /**
   * unpublishArticle - Unpublish an article
   *
   * This endpoint allows the client to unpublish an article.
   * 
   * The user associated with the API key must have any 'admin' or 'moderator' role.
   * 
   * The article will be unpublished and will no longer be visible to the public. It will remain
   * in the database and will set back to draft status on the author's posts dashboard. Any
   * notifications associated with the article will be deleted. Any comments on the article
   * will remain.
  **/
  unpublishArticle(
    req: operations.UnpublishArticleRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.UnpublishArticleResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.UnpublishArticleRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/articles/{id}/unpublish", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "put",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.UnpublishArticleResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          case httpRes?.status == 401:
            break;
          case httpRes?.status == 404:
            break;
        }

        return res;
      })
  }

}
