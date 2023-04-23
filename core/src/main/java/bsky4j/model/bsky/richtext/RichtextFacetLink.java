package bsky4j.model.bsky.richtext;

/**
 * A facet feature for links.
 */
public class RichtextFacetLink implements RichtextFacetFeatureUnion {

    public static final String TYPE = "app.bsky.richtext.facet#link";

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
