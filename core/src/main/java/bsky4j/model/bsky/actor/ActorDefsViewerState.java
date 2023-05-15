package bsky4j.model.bsky.actor;

import javax.annotation.Nullable;

public class ActorDefsViewerState {

    @Nullable
    private Boolean muted;
    @Nullable
    private Boolean blockedBy;
    /** at-uri */
    @Nullable
    private String blocking;
    /** at-uri */
    @Nullable
    private String following;
    /** at-uri */
    @Nullable
    private String followedBy;

    // region
    @Nullable
    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(@Nullable Boolean muted) {
        this.muted = muted;
    }

    @Nullable
    public Boolean getBlockedBy() {
        return blockedBy;
    }

    public void setBlockedBy(@Nullable Boolean blockedBy) {
        this.blockedBy = blockedBy;
    }

    @Nullable
    public String getBlocking() {
        return blocking;
    }

    public void setBlocking(@Nullable String blocking) {
        this.blocking = blocking;
    }

    @Nullable
    public String getFollowing() {
        return following;
    }

    public void setFollowing(@Nullable String following) {
        this.following = following;
    }

    @Nullable
    public String getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(@Nullable String followedBy) {
        this.followedBy = followedBy;
    }
    // endregion
}
