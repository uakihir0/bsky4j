package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.undoc.UndocGetPopularRequest;
import bsky4j.api.entity.bsky.undoc.UndocGetPopularResponse;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsRequest;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsResponse;
import bsky4j.api.entity.share.Response;

import java.util.List;

public interface UndocumentedResource {

    /**
     *
     */
    Response<UndocGetPopularResponse> getPopular(UndocGetPopularRequest request);
}
