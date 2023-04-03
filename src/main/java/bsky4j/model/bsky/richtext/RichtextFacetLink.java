package bsky4j.model.bsky.richtext;

/**
 * A facet feature for links.
 */
public class RichtextFacetLink implements RichtextFacetFeatureUnion {

    @Override
    public String getType() {
        return "app.bsky.richtext.facet#link";
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
