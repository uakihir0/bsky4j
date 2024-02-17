package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.feed.*;
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
    Response<FeedSearchPostsResponse> searchPosts(FeedSearchPostsRequest request);

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
