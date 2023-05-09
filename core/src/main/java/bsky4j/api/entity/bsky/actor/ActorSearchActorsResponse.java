package bsky4j.api.entity.bsky.actor;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class ActorSearchActorsResponse {

    private String cursor;
    private List<ActorDefsProfileView> actors;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<ActorDefsProfileView> getActors() {
        return actors;
    }

    public void setActors(List<ActorDefsProfileView> actors) {
        this.actors = actors;
    }
    // endregion
}
