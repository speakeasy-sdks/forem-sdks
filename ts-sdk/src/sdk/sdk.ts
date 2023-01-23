import axios, { AxiosInstance } from "axios";
import * as utils from "../internal/utils";
import { Security } from "./models/shared";

import { Articles } from "./articles";
import { DisplayAds } from "./displayads";
import { PodcastEpisodes } from "./podcastepisodes";
import { ProfileImages } from "./profileimages";
import { Reactions } from "./reactions";
import { Readinglist } from "./readinglist";
import { Users } from "./users";


export const ServerList = [
	"https://dev.to/api",
] as const;



export type SDKProps = {
  defaultClient?: AxiosInstance;

  security?: Security;

  serverUrl?: string;
}


export class Forem {
  public articles: Articles;
  public displayAds: DisplayAds;
  public podcastEpisodes: PodcastEpisodes;
  public profileImages: ProfileImages;
  public reactions: Reactions;
  public readinglist: Readinglist;
  public users: Users;

  public _defaultClient: AxiosInstance;
  public _securityClient: AxiosInstance;
  public _serverURL: string;
  private _language = "typescript";
  private _sdkVersion = "0.0.1";
  private _genVersion = "0.20.6";

  constructor(props: SDKProps) {
    this._serverURL = props.serverUrl ?? ServerList[0];

    this._defaultClient = props.defaultClient ?? axios.create({ baseURL: this._serverURL });
    if (props.security) {
      let security: Security = props.security;
      if (!(props.security instanceof utils.SpeakeasyBase))
        security = new Security(props.security);
      this._securityClient = utils.createSecurityClient(
        this._defaultClient,
        security
      );
    } else {
      this._securityClient = this._defaultClient;
    }
    
    this.articles = new Articles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.displayAds = new DisplayAds(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.podcastEpisodes = new PodcastEpisodes(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.profileImages = new ProfileImages(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.reactions = new Reactions(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.readinglist = new Readinglist(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.users = new Users(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
  }
}