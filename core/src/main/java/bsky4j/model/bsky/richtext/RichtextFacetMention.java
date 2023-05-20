package bsky4j.model.bsky.richtext;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

/**
 * A facet feature for actor mentions.
 */
public class RichtextFacetMention implements RichtextFacetFeatureUnion {

    @SerializedName("$type")
    public final String type = BlueskyTypes.RichtextFacet + "#mention";

    @Override
    public String getType() {
        return type;
    }

    private String did;

    // region
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
    // endregion
}
