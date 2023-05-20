package bsky4j.model.bsky.richtext;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

/**
 * A facet feature for links.
 */
public class RichtextFacetLink implements RichtextFacetFeatureUnion {

    @SerializedName("$type")
    public final String type = BlueskyTypes.RichtextFacet + "#link";

    @Override
    public String getType() {
        return type;
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
