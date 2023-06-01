package bsky4j.model.bsky.actor;

import bsky4j.BlueskyTypes;

public class ActorDefsContentLabelPref implements ActorDefsPreferencesUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#contentLabelPref";

    @Override
    public String getType() {
        return TYPE;
    }

    private String label;

    /**
     * ["show", "warn", "hide"]
     */
    private String visibility;

    // region
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    // endregion
}
