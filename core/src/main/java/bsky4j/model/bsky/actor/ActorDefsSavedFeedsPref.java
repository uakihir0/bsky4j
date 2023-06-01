package bsky4j.model.bsky.actor;

import bsky4j.BlueskyTypes;

import java.util.List;

public class ActorDefsSavedFeedsPref implements ActorDefsPreferencesUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#savedFeedsPref";

    @Override
    public String getType() {
        return TYPE;
    }

    /** at-url */
    public List<String> pinned;
    /** at-url */
    public List<String> saved;

    // region
    public List<String> getPinned() {
        return pinned;
    }

    public void setPinned(List<String> pinned) {
        this.pinned = pinned;
    }

    public List<String> getSaved() {
        return saved;
    }

    public void setSaved(List<String> saved) {
        this.saved = saved;
    }
    // endregion
}
