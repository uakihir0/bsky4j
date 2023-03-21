package bsky4j.model.bsky.feed;

import javax.annotation.Nullable;
import java.util.List;

public class FeedGetPostThreadViewPost implements FeedGetPostThreadUnion {

    @Override
    public String getType() {
        return "app.bsky.feed.getPostThread#threadViewPost";
    }

    public FeedPostView post;
    @Nullable
    public FeedGetPostThreadUnion parent;
    @Nullable
    public List<FeedGetPostThreadUnion> replies;

    // region // Getter&Setter
    public FeedPostView getPost() {
        return post;
    }

    public void setPost(FeedPostView post) {
        this.post = post;
    }

    @Nullable
    public FeedGetPostThreadUnion getParent() {
        return parent;
    }

    public void setParent(@Nullable FeedGetPostThreadUnion parent) {
        this.parent = parent;
    }

    @Nullable
    public List<FeedGetPostThreadUnion> getReplies() {
        return replies;
    }

    public void setReplies(@Nullable List<FeedGetPostThreadUnion> replies) {
        this.replies = replies;
    }
    // endregion
}
