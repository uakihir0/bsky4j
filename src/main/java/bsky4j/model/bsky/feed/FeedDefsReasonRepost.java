package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorDefsProfileViewBasic;

public class FeedDefsReasonRepost {

    private ActorDefsProfileViewBasic by;

    private String indexedAt;

    // region
    public ActorDefsProfileViewBasic getBy() {
        return by;
    }

    public void setBy(ActorDefsProfileViewBasic by) {
        this.by = by;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }
    // endregion
}
