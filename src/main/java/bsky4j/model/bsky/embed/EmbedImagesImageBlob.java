package bsky4j.model.bsky.embed;

public class EmbedImagesImageBlob {

    private String cid;
    private String mimeType;

    // region // Getter&Setter
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    // endregion
}
