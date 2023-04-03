package bsky4j.model.bsky.feed;

import javax.annotation.Nullable;

public class FeedDefsViewerState {

    @Nullable
    private String repost;
    @Nullable
    private String like;

    // region
    @Nullable
    public String getRepost() {
        return repost;
    }

    public void setRepost(@Nullable String repost) {
        this.repost = repost;
    }

    @Nullable
    public String getLike() {
        return like;
    }

    public void setLike(@Nullable String like) {
        this.like = like;
    }
    // endregion
}
