package bsky4j.model.atproto.repo;

import bsky4j.model.share.RecordUnion;

public class RepoListRecordsRecord {

    private String uri;
    private String cid;
    private RecordUnion value;

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

    public RecordUnion getValue() {
        return value;
    }

    public void setValue(RecordUnion value) {
        this.value = value;
    }
    // endregion
}
