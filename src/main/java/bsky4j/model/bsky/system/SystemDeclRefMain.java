package bsky4j.model.bsky.system;

/**
 * A reference to a app.bsky.system.declaration record.
 */
public class SystemDeclRefMain {

    private String cid;
    private String actorType;

    // region // Getter&Setter
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }
    // endregion
}
