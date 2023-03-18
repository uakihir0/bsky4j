package bsky4j.model.atproto.repo;

/**
 * A URI with a content-hash fingerprint.
 */
public class RepoStrongRefMain {
    private String uri;
    private String cid;

    // region // Getter&Setter
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    // endregion
}
