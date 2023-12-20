package bsky4j.api.bsky;

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

/**
 * Bluesky/Feed
 * <a href="https://atproto.com/lexicons/app-bsky-feed">Reference</a>
 */
public interface FeedResource {

    /**
     * A view of a user's feed.
     */
    Response<FeedGetAuthorFeedResponse> getAuthorFeed(FeedGetAuthorFeedRequest request);

    /**
     *
     */
    Response<FeedGetLikesResponse> getLikes(FeedGetLikesRequest request);

    /**
     *
     */
    Response<FeedGetPostThreadResponse> getPostThread(FeedGetPostThreadRequest request);

    /**
     * A view of an actor's feed.
     */
    Response<FeedGetPostsResponse> getPosts(FeedGetPostsRequest request);

    /**
     *
     */
    Response<FeedGetRepostedByResponse> getRepostedBy(FeedGetRepostedByRequest request);

    /**
     * A view of the user's home timeline.
     */
    Response<FeedGetTimelineResponse> getTimeline(FeedGetTimelineRequest request);

    /**
     * Compose and hydrate a feed from a user's selected feed generator.
     */
    Response<FeedGetFeedResponse> getFeed(FeedGetFeedRequest request);

    /**
     * Retrieve a list of feeds created by a given actor
     */
    Response<FeedGetActorFeedsResponse> getActorFeeds(FeedGetActorFeedsRequest request);

    /**
     * Get a list of posts liked by an actor.
     */
    Response<FeedGetActorLikesResponse> getActorLikes(FeedGetActorLikesRequest request);

    /**
     * Get information about a specific feed offered by a feed generator, such as its online status.
     */
    Response<FeedGetFeedGeneratorResponse> getFeedGenerator(FeedGetFeedGeneratorRequest request);

    /**
     * Get information about a list of feed generators.
     */
    Response<FeedGetFeedGeneratorsResponse> getFeedGenerators(FeedGetFeedGeneratorsRequest request);

    /**
     * Like feed operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<FeedLikeResponse> like(FeedLikeRequest request);

    /**
     * Delete Like operation.
     * (ATProtocol/Repo deleteRecord wrapper)
     */
    Response<Void> deleteLike(FeedDeleteLikeRequest request);

    /**
     * Post feed operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<FeedPostResponse> post(FeedPostRequest request);

    /**
     * Delete Feed operation.
     * (ATProtocol/Repo deleteRecord wrapper)
     */
    Response<Void> deletePost(FeedDeletePostRequest request);

    /**
     * Repost feed operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<FeedRepostResponse> repost(FeedRepostRequest request);

    /**
     * Delete Repost operation.
     * (ATProtocol/Repo deleteRecord wrapper)
     */
    Response<Void> deleteRepost(FeedDeleteRepostRequest request);
}
