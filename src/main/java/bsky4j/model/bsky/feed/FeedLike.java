package bsky4j.model.bsky.feed;

import bsky4j.model.atproto.repo.RepoStrongRef;
import bsky4j.model.share.RecordUnion;

public class FeedLike implements RecordUnion {

    @Override
    public String getType() {
        return "app.bsky.feed.like";
    }

    private RepoStrongRef subject;
    private String createdAt;

    // region
    public RepoStrongRef getSubject() {
        return subject;
    }

    public void setSubject(RepoStrongRef subject) {
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
