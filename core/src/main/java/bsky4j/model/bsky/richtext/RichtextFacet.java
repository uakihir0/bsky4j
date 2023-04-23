package bsky4j.model.bsky.richtext;

import java.util.List;

public class RichtextFacet {

    private RichtextFacetByteSlice index;
    private List<RichtextFacetFeatureUnion> features;

    // region
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
