package bsky4j.model.bsky.graph;

import bsky4j.BlueskyTypes;
import bsky4j.model.share.RecordUnion;

public class GraphFollow implements RecordUnion {

    @Override
    public String getType() {
        return BlueskyTypes.GraphFollow;
    }

    private String subject;
    private String createdAt;

    // region
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    // endregion
}
