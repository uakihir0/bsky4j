package bsky4j.model.bsky.actor;

import javax.annotation.Nullable;

public class ActorRefViewerState {
    @Nullable
    private Boolean muted;

    // region // Getter&Setter
    @Nullable
    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(@Nullable Boolean muted) {
        this.muted = muted;
    }
    // endregion
}