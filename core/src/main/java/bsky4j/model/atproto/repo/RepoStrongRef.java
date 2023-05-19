package bsky4j.model.atproto.repo;

import java.util.Objects;

/**
 * A URI with a content-hash fingerprint.
 */
public class RepoStrongRef {

    private String uri;
    private String cid;

    public RepoStrongRef(String uri, String cid) {
        this.uri = uri;
        this.cid = cid;
    }

    // region
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

    @Override
    public boolean equals(Object obj) {
        RepoStrongRef ref = (RepoStrongRef) obj;
        return ref.getUri().equals(this.uri) && ref.getCid().equals(this.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, cid);
    }
}
