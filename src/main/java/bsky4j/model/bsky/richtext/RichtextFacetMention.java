package bsky4j.model.bsky.richtext;

/**
 * A facet feature for actor mentions.
 */
public class RichtextFacetMention  implements RichtextFacetFeatureUnion {

    @Override
    public String getType() {
        return "app.bsky.richtext.facet#mention";
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
