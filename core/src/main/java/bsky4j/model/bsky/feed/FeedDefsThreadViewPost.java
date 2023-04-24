package bsky4j.model.bsky.feed;

import bsky4j.BlueskyTypes;

import javax.annotation.Nullable;
import java.util.List;

public class FeedDefsThreadViewPost implements FeedDefsThreadUnion {

    public static final String TYPE = BlueskyTypes.FeedDefs + "#threadViewPost";

    @Override
    public String getType() {
        return TYPE;
    }

    public FeedDefsPostView post;
    @Nullable
    public FeedDefsThreadUnion parent;
    @Nullable
    public List<FeedDefsThreadUnion> replies;

    // region
    public FeedDefsPostView getPost() {
        return post;
    }

    public void setPost(FeedDefsPostView post) {
        this.post = post;
    }

    @Nullable
    public FeedDefsThreadUnion getParent() {
        return parent;
    }

    public void setParent(@Nullable FeedDefsThreadUnion parent) {
        this.parent = parent;
    }

    @Nullable
    public List<FeedDefsThreadUnion> getReplies() {
        return replies;
    }

    public void setReplies(@Nullable List<FeedDefsThreadUnion> replies) {
        this.replies = replies;
    }
    // endregion
}
