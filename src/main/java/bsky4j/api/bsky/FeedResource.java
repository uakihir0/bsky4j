package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
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

    // TODO
    void getPostThread();

    // TODO
    void getRepostedBy();

    /**
     * A view of the user's home timeline.
     */
    void getTimeline();

    // TODO
    void getVotes();

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
