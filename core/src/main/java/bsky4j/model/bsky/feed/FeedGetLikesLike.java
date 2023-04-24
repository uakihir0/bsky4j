package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

public class FeedGetLikesLike {

    private String indexedAt;
    private String createdAt;
    private ActorDefsProfileView actor;

    // region
    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ActorDefsProfileView getActor() {
        return actor;
    }

    public void setActor(ActorDefsProfileView actor) {
        this.actor = actor;
    }
    // endregion
}
