package bsky4j.model.bsky.feed;

import bsky4j.model.atproto.repo.RepoStrongRef;

public class FeedPostReplyRef {

    private RepoStrongRef root;
    private RepoStrongRef parent;

    // region
    public RepoStrongRef getRoot() {
        return root;
    }

    public void setRoot(RepoStrongRef root) {
        this.root = root;
    }

    public RepoStrongRef getParent() {
        return parent;
    }

    public void setParent(RepoStrongRef parent) {
        this.parent = parent;
    }
    // endregion
}
