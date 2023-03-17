package bsky4j.model.bsky.feed;

public class FeedViewPostReplyRef {

    private FeedPostView root;
    private FeedPostView parent;

    // region // Getter&Setter
    public FeedPostView getRoot() {
        return root;
    }

    public void setRoot(FeedPostView root) {
        this.root = root;
    }

    public FeedPostView getParent() {
        return parent;
    }

    public void setParent(FeedPostView parent) {
        this.parent = parent;
    }
    // endregion
}
