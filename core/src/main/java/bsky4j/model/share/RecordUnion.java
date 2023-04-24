package bsky4j.model.share;

/**
 * @see bsky4j.model.bsky.actor.ActorProfile
 * @see bsky4j.model.bsky.graph.GraphFollow
 * @see bsky4j.model.bsky.feed.FeedLike
 * @see bsky4j.model.bsky.feed.FeedPost
 * @see bsky4j.model.bsky.feed.FeedRepost
 */
public interface RecordUnion {
    String getType();
}
