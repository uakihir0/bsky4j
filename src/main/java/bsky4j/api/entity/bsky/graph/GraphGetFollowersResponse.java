package bsky4j.api.entity.bsky.graph;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class GraphGetFollowersResponse {

    private ActorDefsProfileView subject;
    private String cursor;
    private List<ActorDefsProfileView> followers;

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

    public List<ActorDefsProfileView> getFollowers() {
        return followers;
    }

    public void setFollowers(List<ActorDefsProfileView> followers) {
        this.followers = followers;
    }
    // endregion
}
