package bsky4j.model.bsky.feed;

public class FeedDefsReplyRef {

    private FeedDefsPostView root;
    private FeedDefsPostView parent;

    // region
    public FeedDefsPostView getRoot() {
        return root;
    }

    public void setRoot(FeedDefsPostView root) {
        this.root = root;
    }

    public FeedDefsPostView getParent() {
        return parent;
    }

    public void setParent(FeedDefsPostView parent) {
        this.parent = parent;
    }
    // endregion
}
