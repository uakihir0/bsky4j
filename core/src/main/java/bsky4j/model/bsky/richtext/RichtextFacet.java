package bsky4j.model.bsky.richtext;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RichtextFacet {

    @SerializedName("$type")
    private final String type = BlueskyTypes.RichtextFacet;

    private RichtextFacetByteSlice index;
    private List<RichtextFacetFeatureUnion> features;

    // region
    public String getType() {
        return type;
    }

    public RichtextFacetByteSlice getIndex() {
        return index;
    }

    public void setIndex(RichtextFacetByteSlice index) {
        this.index = index;
    }

    public List<RichtextFacetFeatureUnion> getFeatures() {
        return features;
    }

    public void setFeatures(List<RichtextFacetFeatureUnion> features) {
        this.features = features;
    }
    // endregion
}
