package bsky4j.internal.bsky;

import bsky4j.ATProtocolTypes;
import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.bsky.feed.FeedGetLikesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetLikesResponse;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadResponse;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByRequest;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByResponse;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineRequest;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineResponse;
import bsky4j.api.entity.bsky.feed.FeedPostRequest;
import bsky4j.api.entity.bsky.feed.FeedPostResponse;
import bsky4j.api.entity.share.Response;
import com.google.gson.Gson;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _FeedResource implements FeedResource {

    private final String uri;

    _FeedResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<FeedGetAuthorFeedResponse> getAuthorFeed(FeedGetAuthorFeedRequest request) {
        return proceed(FeedGetAuthorFeedResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.FeedGetAuthorFeed)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetLikesResponse> getLikes(FeedGetLikesRequest request) {
        return proceed(FeedGetLikesResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.FeedGetLikes)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetPostThreadResponse> getPostThread(FeedGetPostThreadRequest request) {
        return proceed(FeedGetPostThreadResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.FeedGetPostThread)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetRepostedByResponse> getRepostedBy(FeedGetRepostedByRequest request) {
        return proceed(FeedGetRepostedByResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.FeedGetRepostedBy)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedGetTimelineResponse> getTimeline(FeedGetTimelineRequest request) {
        return proceed(FeedGetTimelineResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.FeedGetTimeline)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<FeedPostResponse> like(FeedPostRequest request) {
        return null;
    }


    @Override
    public Response<FeedPostResponse> post(FeedPostRequest request) {
        return proceed(FeedPostResponse.class, () -> {

            RepoCreateRecordRequest record =
                    RepoCreateRecordRequest.builder()
                            .accessJwt(request.getAccessJwt())
                            .repo(request.getDid())
                            .collection(BlueskyTypes.FeedPost)
                            .record(request.toPost())
                            .build();

            System.out.println(new Gson().toJson(request.toPost()));
            System.out.println(">>>");
            System.out.println(new Gson().toJson(record.getRecord()));

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolTypes.RepoCreateRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(record.toJson())
                    .post();
        });
    }

    @Override
    public Response<FeedPostResponse> repost(FeedPostRequest request) {
        return null;
    }
}
