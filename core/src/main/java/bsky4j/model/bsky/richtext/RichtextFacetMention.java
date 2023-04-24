package bsky4j.model.bsky.richtext;

/**
 * A facet feature for actor mentions.
 */
public class RichtextFacetMention implements RichtextFacetFeatureUnion {

    public static final String TYPE = "app.bsky.richtext.facet#mention";

    @Override
    public String getType() {
        return TYPE;
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
