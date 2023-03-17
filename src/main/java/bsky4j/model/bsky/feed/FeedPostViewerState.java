package bsky4j.model.bsky.feed;

import javax.annotation.Nullable;

public class FeedPostViewerState {

    @Nullable
    private String repost;
    @Nullable
    private String upvote;
    @Nullable
    private String downvote;
    @Nullable
    private Boolean muted;

    // region // Getter&Setter
    @Nullable
    public String getRepost() {
        return repost;
    }

    public void setRepost(@Nullable String repost) {
        this.repost = repost;
    }

    @Nullable
    public String getUpvote() {
        return upvote;
    }

    public void setUpvote(@Nullable String upvote) {
        this.upvote = upvote;
    }

    @Nullable
    public String getDownvote() {
        return downvote;
    }

    public void setDownvote(@Nullable String downvote) {
        this.downvote = downvote;
    }

    @Nullable
    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(@Nullable Boolean muted) {
        this.muted = muted;
    }

    // endregion
}
