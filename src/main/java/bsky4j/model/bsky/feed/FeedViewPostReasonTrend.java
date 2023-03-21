package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorRefWithInfo;

public class FeedViewPostReasonTrend implements FeedViewPostReasonUnion {

    @Override
    public String getType() {
        return "app.bsky.feed.feedViewPost#reasonTrend";
    }

    private ActorRefWithInfo by;
    private String indexedAt;

    // region // Getter&Setter
    @Override
    public ActorRefWithInfo getBy() {
        return by;
    }

    public void setBy(ActorRefWithInfo by) {
        this.by = by;
    }

    @Override
    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }
    // endregion
}
