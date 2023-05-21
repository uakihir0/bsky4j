package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;

public class EmbedRecordViewBlocked implements EmbedRecordViewUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#viewBlocked";

    @Override
    public String getType() {
        return TYPE;
    }

    private String uri;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    // endregion

}
