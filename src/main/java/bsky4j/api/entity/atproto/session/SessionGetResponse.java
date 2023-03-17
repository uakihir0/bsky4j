package bsky4j.api.entity.atproto.session;

public class SessionGetResponse {
    private String handle;
    private String did;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }
}
