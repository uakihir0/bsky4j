package bsky4j.api.entity.bsky.graph;

import bsky4j.model.bsky.actor.ActorDefsProfileView;

import java.util.List;

public class GraphGetBlocksResponse {

    private String cursor;
    private List<ActorDefsProfileView> blocks;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<ActorDefsProfileView> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<ActorDefsProfileView> blocks) {
        this.blocks = blocks;
    }
    // endregion
}
