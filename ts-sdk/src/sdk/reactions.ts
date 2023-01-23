import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Reactions {
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
   * postApiReactions - create reaction
   *
   * This endpoint allows the client to create a reaction to a specified reactable (eg, Article, Comment, or User). For examples:
   *         * "Like"ing an Article will create a new "like" Reaction from the user for that Articles
   *         * "Like"ing that Article a second time will return the previous "like"
  **/
  postApiReactions(
    req: operations.PostApiReactionsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostApiReactionsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostApiReactionsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/reactions";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "post",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.PostApiReactionsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

  
  /**
   * postApiReactionsToggle - toggle reaction
   *
   * This endpoint allows the client to toggle the user's reaction to a specified reactable (eg, Article, Comment, or User). For examples:
   *         * "Like"ing an Article will create a new "like" Reaction from the user for that Articles
   *         * "Like"ing that Article a second time will remove the "like" from the user
  **/
  postApiReactionsToggle(
    req: operations.PostApiReactionsToggleRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.PostApiReactionsToggleResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.PostApiReactionsToggleRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/reactions/toggle";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "post",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.PostApiReactionsToggleResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            break;
          case httpRes?.status == 401:
            break;
        }

        return res;
      })
  }

}
