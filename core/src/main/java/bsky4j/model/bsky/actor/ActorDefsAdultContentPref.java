package bsky4j.model.bsky.actor;

import bsky4j.BlueskyTypes;

public class ActorDefsAdultContentPref implements ActorDefsPreferencesUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#adultContentPref";

    @Override
    public String getType() {
        return TYPE;
    }

    private Boolean enabled;

    // region
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    // endregion
}
