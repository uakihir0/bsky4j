package bsky4j.model.bsky.richtext;

import com.google.gson.annotations.SerializedName;

import bsky4j.BlueskyTypes;

/**
 * A facet feature for hashtag.
 */
public class RichtextFacetTag implements RichtextFacetFeatureUnion {

    @SerializedName("$type")
    public final String type = BlueskyTypes.RichtextFacet + "#tag";

    @Override
    public String getType() {
        return type;
    }

    private String tag;

    // region
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    // endregion
}
