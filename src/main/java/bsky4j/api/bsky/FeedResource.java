package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadResponse;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByRequest;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByResponse;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineRequest;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineResponse;
import bsky4j.api.entity.bsky.feed.FeedGetVotesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetVotesResponse;
import bsky4j.api.entity.share.Response;

/**
 * Bluesky/Feed
 * https://atproto.com/lexicons/app-bsky-feed
 */
public interface FeedResource {

    /**
     * A view of a user's feed.
     */
    Response<FeedGetAuthorFeedResponse> getAuthorFeed(FeedGetAuthorFeedRequest request);

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
     *
     */
    Response<FeedGetVotesResponse> getVotes(FeedGetVotesRequest request);

    /**
     * Post feed operation.
     */
    void post();

    /**
     * Repost feed operation.
     */
    void repost();

    /**
     * Upvote, downvote, or clear the user's vote for a post.
     */
    void setVote();

    // TODO
    void trend();

    // TODO
    void vote();
}
