package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;

public class EmbedExternalView implements EmbedViewUnion {

    public static final String TYPE = BlueskyTypes.EmbedExternal + "#view";

    @Override
    public String getType() {
        return TYPE;
    }

    private EmbedExternalViewExternal external;

    // region
    public EmbedExternalViewExternal getExternal() {
        return external;
    }

    public void setExternal(EmbedExternalViewExternal external) {
        this.external = external;
    }
    // endregion
}
