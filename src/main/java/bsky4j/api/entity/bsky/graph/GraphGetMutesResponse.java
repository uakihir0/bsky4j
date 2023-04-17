package bsky4j.api.entity.bsky.graph;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class GraphGetMutesResponse {

    private String cursor;
    private List<ActorDefsProfileView> mutes;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<ActorDefsProfileView> getMutes() {
        return mutes;
    }

    public void setMutes(List<ActorDefsProfileView> mutes) {
        this.mutes = mutes;
    }
    // endregion
}
