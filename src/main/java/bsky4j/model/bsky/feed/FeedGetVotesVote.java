package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorRefWithInfo;

public class FeedGetVotesVote {

    private String direction;
    private String indexedAt;
    private String createdAt;
    private ActorRefWithInfo actor;

    // region // Getter&Setter
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

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

    public ActorRefWithInfo getActor() {
        return actor;
    }

    public void setActor(ActorRefWithInfo actor) {
        this.actor = actor;
    }
    // endregion
}
