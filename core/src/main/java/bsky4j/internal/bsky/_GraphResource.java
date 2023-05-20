package bsky4j.internal.bsky;

import bsky4j.ATProtocolTypes;
import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoDeleteRecordRequest;
import bsky4j.api.entity.bsky.graph.GraphBlockRequest;
import bsky4j.api.entity.bsky.graph.GraphBlockResponse;
import bsky4j.api.entity.bsky.graph.GraphDeleteBlockRequest;
import bsky4j.api.entity.bsky.graph.GraphDeleteFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowResponse;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksRequest;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksResponse;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersResponse;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsResponse;
import bsky4j.api.entity.bsky.graph.GraphGetMutesRequest;
import bsky4j.api.entity.bsky.graph.GraphGetMutesResponse;
import bsky4j.api.entity.bsky.graph.GraphMuteActorRequest;
import bsky4j.api.entity.bsky.graph.GraphUnmuteActorRequest;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;
import static bsky4j.internal.share._InternalUtility.xrpc;

public class _GraphResource implements GraphResource {

    private final String uri;

    public _GraphResource(String uri) {
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
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.RepoCreateRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }

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
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.RepoDeleteRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }

    @Override
    public Response<GraphGetFollowersResponse> getFollowers(
            GraphGetFollowersRequest request
    ) {
        return proceed(GraphGetFollowersResponse.class, () -> {
            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.GraphGetFollowers)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<GraphGetFollowsResponse> getFollows(
            GraphGetFollowsRequest request
    ) {
        return proceed(GraphGetFollowsResponse.class, () -> {
            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.GraphGetFollows)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<GraphGetMutesResponse> getMutes(
            GraphGetMutesRequest request
    ) {
        return proceed(GraphGetMutesResponse.class, () -> {
            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.GraphGetMutes)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<Void> muteActor(
            GraphMuteActorRequest request
    ) {
        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(BlueskyTypes.GraphMuteActor)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public Response<Void> unmuteActor(
            GraphUnmuteActorRequest request
    ) {
        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(BlueskyTypes.GraphUnmuteActor)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public Response<GraphBlockResponse> block(
            GraphBlockRequest request
    ) {
        return proceed(GraphBlockResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.GraphBlock)
                            .record(request.toBlock())
                            .build();

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.RepoCreateRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }

    @Override
    public Response<Void> deleteBlock(
            GraphDeleteBlockRequest request
    ) {
        return proceed(() -> {

            RepoDeleteRecordRequest record =
                    RepoDeleteRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.GraphBlock)
                            .rkey(request.getRkey())
                            .build();

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.RepoDeleteRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }

    @Override
    public Response<GraphGetBlocksResponse> getBlocks(
            GraphGetBlocksRequest request
    ) {
        return proceed(GraphGetBlocksResponse.class, () -> {
            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.GraphGetBlocks)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }
}
