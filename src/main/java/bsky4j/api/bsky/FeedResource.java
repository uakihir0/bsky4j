package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.feed.FeedDeleteLikeRequest;
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
     *
     */
    Response<FeedGetRepostedByResponse> getRepostedBy(FeedGetRepostedByRequest request);

    /**
     * A view of the user's home timeline.
     */
    Response<FeedGetTimelineResponse> getTimeline(FeedGetTimelineRequest request);

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
     * Repost feed operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<FeedRepostResponse> repost(FeedRepostRequest request);
}
