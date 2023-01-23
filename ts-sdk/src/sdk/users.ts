import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class Users {
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
   * getUser - A User
   *
   * This endpoint allows the client to retrieve a single user, either by id
   * or by the user's username.
   * 
   * For complete documentation, see the v0 API docs: https://developers.forem.com/api/v0#tag/users/operation/getUser
  **/
  getUser(
    req: operations.GetUserRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetUserResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetUserRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/users/{id}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetUserResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            break;
        }

        return res;
      })
  }

  
  /**
   * suspendUser - Suspend a User
   *
   * This endpoint allows the client to suspend a user.
   * 
   * The user associated with the API key must have any 'admin' or 'moderator' role.
   * 
   * This specified user will be assigned the 'suspended' role. Suspending a user will stop the
   * user from posting new posts and comments. It doesn't delete any of the user's content, just
   * prevents them from creating new content while suspended. Users are not notified of their suspension
   * in the UI, so if you want them to know about this, you must notify them.
  **/
  suspendUser(
    req: operations.SuspendUserRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.SuspendUserResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.SuspendUserRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/users/{id}/suspend", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "put",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.SuspendUserResponse = {statusCode: httpRes.status, contentType: contentType};
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

  
  /**
   * unpublishUser - Unpublish a User's Articles and Comments
   *
   * This endpoint allows the client to unpublish all of the articles and
   * comments created by a user.
   * 
   * The user associated with the API key must have any 'admin' or 'moderator' role.
   * 
   * This specified user's articles and comments will be unpublished and will no longer be
   * visible to the public. They will remain in the database and will set back to draft status
   * on the specified user's  dashboard. Any notifications associated with the specified user's
   * articles and comments will be deleted.
   * 
   * Note this endpoint unpublishes articles and comments asychronously: it will return a 204 NO CONTENT
   * status code immediately, but the articles and comments will not be unpublished until the
   * request is completed on the server.
  **/
  unpublishUser(
    req: operations.UnpublishUserRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.UnpublishUserResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.UnpublishUserRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/users/{id}/unpublish", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "put",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.UnpublishUserResponse = {statusCode: httpRes.status, contentType: contentType};
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
