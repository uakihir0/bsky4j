package bsky4j.api.entity.bsky.graph;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class GraphGetFollowsResponse {

    private ActorDefsProfileView subject;
    private String cursor;
    private List<ActorDefsProfileView> follows;

    // region
    public ActorDefsProfileView getSubject() {
        return subject;
    }

    public void setSubject(ActorDefsProfileView subject) {
        this.subject = subject;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<ActorDefsProfileView> getFollows() {
        return follows;
    }

    public void setFollows(List<ActorDefsProfileView> follows) {
        this.follows = follows;
    }
    // endregion
}
