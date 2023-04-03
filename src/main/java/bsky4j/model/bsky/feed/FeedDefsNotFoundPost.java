package bsky4j.model.bsky.feed;

import bsky4j.BlueskyTypes;

public class FeedDefsNotFoundPost  implements FeedDefsThreadUnion {

    public static final String TYPE = BlueskyTypes.FeedDefs + "#notFoundPost";

    @Override
    public String getType() {
        return TYPE;
    }

    private String uri;
    private Boolean notFound = true;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getNotFound() {
        return notFound;
    }

    public void setNotFound(Boolean notFound) {
        this.notFound = notFound;
    }
    // endregion
}
