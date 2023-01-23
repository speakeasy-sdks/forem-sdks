import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import * as shared from "../shared";



export class GetPodcastEpisodesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=page" })
  page?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=per_page" })
  perPage?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=username" })
  username?: string;
}


export class GetPodcastEpisodesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  queryParams: GetPodcastEpisodesQueryParams;
}


export class GetPodcastEpisodesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata({ elemType: shared.PodcastEpisodeIndex })
  podcastEpisodeIndices?: shared.PodcastEpisodeIndex[];

  @SpeakeasyMetadata()
  statusCode: number;
}
