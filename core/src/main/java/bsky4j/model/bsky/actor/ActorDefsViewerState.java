package bsky4j.model.bsky.actor;

import javax.annotation.Nullable;

public class ActorDefsViewerState {

    @Nullable
    private Boolean muted;
    @Nullable
    private String following;
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
