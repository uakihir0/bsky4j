package bsky4j.internal.bsky;

import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.UndocumentedResource;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.bsky.undoc.UndocGetPopularRequest;
import bsky4j.api.entity.bsky.undoc.UndocGetPopularResponse;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsRequest;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsResponse;
import bsky4j.api.entity.share.Response;
import com.google.gson.reflect.TypeToken;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import java.net.URL;
import java.util.List;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _UndocumentedResource implements UndocumentedResource {

    private final String uri;

    public _UndocumentedResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<List<UndocSearchFeedsResponse>> searchFeeds(
            UndocSearchFeedsRequest request
    ) {
        return proceed(new TypeToken<List<UndocSearchFeedsResponse>>() {
        }, () -> {
            try {
                // TODO: エンドポイントを外部指定可能に変更
                URL url = new URL(this.uri);
                String target = url.getProtocol()
                        + "://search."
                        + url.getHost()
                        + "/search/";

                HttpRequestBuilder builder =
                        new HttpRequestBuilder()
                                .target(target)
                                .path("posts")
                                .request(HttpMediaType.APPLICATION_JSON);

                request.toMap().forEach(builder::param);
                return builder.get();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Override
    public Response<UndocGetPopularResponse> getPopular(
            UndocGetPopularRequest request
    ) {
        return proceed(UndocGetPopularResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.UnspeccedGetPopular)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }
}
