package bsky4j.internal.bsky;

import static bsky4j.internal.share._InternalUtility.proceed;
import static bsky4j.internal.share._InternalUtility.xrpc;

import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import bsky4j.ATProtocolTypes;
import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoDeleteRecordRequest;
import bsky4j.api.entity.bsky.feed.FeedDeleteLikeRequest;
import bsky4j.api.entity.bsky.feed.FeedDeletePostRequest;
import bsky4j.api.entity.bsky.feed.FeedDeleteRepostRequest;
import bsky4j.api.entity.bsky.feed.FeedGetActorFeedsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetActorFeedsResponse;
import bsky4j.api.entity.bsky.feed.FeedGetActorLikesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetActorLikesResponse;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorRequest;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorResponse;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorsResponse;
import bsky4j.api.entity.bsky.feed.FeedGetFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetFeedResponse;
import bsky4j.api.entity.bsky.feed.FeedGetLikesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetLikesResponse;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadResponse;
import bsky4j.api.entity.bsky.feed.FeedGetPostsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostsResponse;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByRequest;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByResponse;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineRequest;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineResponse;
import bsky4j.api.entity.bsky.feed.FeedLikeRequest;
import bsky4j.api.entity.bsky.feed.FeedLikeResponse;
import bsky4j.api.entity.bsky.feed.FeedPostRequest;
import bsky4j.api.entity.bsky.feed.FeedPostResponse;
import bsky4j.api.entity.bsky.feed.FeedRepostRequest;
import bsky4j.api.entity.bsky.feed.FeedRepostResponse;
import bsky4j.api.entity.share.Response;

public class _FeedResource implements FeedResource {

    private final String uri;

    public _FeedResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<FeedGetAuthorFeedResponse> getAuthorFeed(
            FeedGetAuthorFeedRequest request
    ) {
        return proceed(FeedGetAuthorFeedResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetAuthorFeed)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetLikesResponse> getLikes(
            FeedGetLikesRequest request
    ) {
        return proceed(FeedGetLikesResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetLikes)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetPostThreadResponse> getPostThread(
            FeedGetPostThreadRequest request
    ) {
        return proceed(FeedGetPostThreadResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetPostThread)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetPostsResponse> getPosts(
            FeedGetPostsRequest request
    ) {
        return proceed(FeedGetPostsResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetPosts)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.getUris().forEach(u ->
                    builder.param("uris", u));
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetRepostedByResponse> getRepostedBy(
            FeedGetRepostedByRequest request
    ) {
        return proceed(FeedGetRepostedByResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetRepostedBy)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetTimelineResponse> getTimeline(
            FeedGetTimelineRequest request
    ) {
        return proceed(FeedGetTimelineResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetTimeline)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetFeedResponse> getFeed(
            FeedGetFeedRequest request
    ) {
        return proceed(FeedGetFeedResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetFeed)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetActorFeedsResponse> getActorFeeds(
            FeedGetActorFeedsRequest request
    ) {
        return proceed(FeedGetActorFeedsResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetActorFeeds)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetActorLikesResponse> getActorLikes(
            FeedGetActorLikesRequest request
    ) {
        return proceed(FeedGetActorLikesResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetActorLikes)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetFeedGeneratorResponse> getFeedGenerator(
            FeedGetFeedGeneratorRequest request
    ) {
        return proceed(FeedGetFeedGeneratorResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetFeedGenerator)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetFeedGeneratorsResponse> getFeedGenerators(
            FeedGetFeedGeneratorsRequest request
    ) {
        return proceed(FeedGetFeedGeneratorsResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.FeedGetFeedGenerators)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.getFeeds().forEach(u ->
                    builder.param("feeds", u));
            return builder.get();
        });
    }

    @Override
    public Response<FeedLikeResponse> like(
            FeedLikeRequest request
    ) {
        return proceed(FeedLikeResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedLike)
                            .record(request.toLike())
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
    public Response<Void> deleteLike(
            FeedDeleteLikeRequest request
    ) {
        return proceed(() -> {

            RepoDeleteRecordRequest record =
                    RepoDeleteRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedLike)
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
    public Response<FeedPostResponse> post(
            FeedPostRequest request
    ) {
        return proceed(FeedPostResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedPost)
                            .record(request.toPost())
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
    public Response<Void> deletePost(
            FeedDeletePostRequest request
    ) {
        return proceed(() -> {

            RepoDeleteRecordRequest record =
                    RepoDeleteRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedPost)
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
    public Response<FeedRepostResponse> repost(
            FeedRepostRequest request
    ) {
        return proceed(FeedRepostResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedRepost)
                            .record(request.toRepost())
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
    public Response<Void> deleteRepost(
            FeedDeleteRepostRequest request
    ) {
        return proceed(() -> {

            RepoDeleteRecordRequest record =
                    RepoDeleteRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedRepost)
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
}
