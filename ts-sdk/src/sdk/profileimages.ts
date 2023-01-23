import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import * as operations from "./models/operations";
import * as utils from "../internal/utils";

export class ProfileImages {
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
   * getProfileImage - A Users or organizations profile image
   *
   * This endpoint allows the client to retrieve a user or organization profile image information by its
   *         corresponding username.
  **/
  getProfileImage(
    req: operations.GetProfileImageRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetProfileImageResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetProfileImageRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/profile_images/{username}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetProfileImageResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getProfileImage200ApplicationJSONObject = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            break;
        }

        return res;
      })
  }

}
