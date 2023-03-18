package bsky4j.model.bsky.feed;

import bsky4j.model.atproto.repo.RepoStrongRefMain;

public class FeedPostReplyRef {
    private RepoStrongRefMain root;
    private RepoStrongRefMain parent;

    // region // Getter&Setter
    public RepoStrongRefMain getRoot() {
        return root;
    }

    public void setRoot(RepoStrongRefMain root) {
        this.root = root;
    }

    public RepoStrongRefMain getParent() {
        return parent;
    }

    public void setParent(RepoStrongRefMain parent) {
        this.parent = parent;
    }
    // endregion
}
