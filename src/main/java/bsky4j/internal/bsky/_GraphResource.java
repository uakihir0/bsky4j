package bsky4j.internal.bsky;

import bsky4j.ATProtocolTypes;
import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoDeleteRecordRequest;
import bsky4j.api.entity.bsky.feed.FeedPostResponse;
import bsky4j.api.entity.bsky.graph.GraphDeleteFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowResponse;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _GraphResource implements GraphResource {

    private final String uri;

    _GraphResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<GraphFollowResponse> follow(
            GraphFollowRequest request
    ) {
        return proceed(GraphFollowResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.GraphFollow)
                            .record(request.toFollow())
                            .build();

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolTypes.RepoCreateRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });    }

    @Override
    public Response<Void> deleteFollow(
            GraphDeleteFollowRequest request
    ) {
        return proceed(() -> {

            RepoDeleteRecordRequest record =
                    RepoDeleteRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.GraphFollow)
                            .rkey(request.getRkey())
                            .build();

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolTypes.RepoDeleteRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }
}
