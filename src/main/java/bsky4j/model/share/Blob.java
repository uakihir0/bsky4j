package bsky4j.model.share;

import com.google.gson.annotations.SerializedName;

public class Blob {

    @SerializedName("$type")
    private String type = "blob";
    private BlobRef ref;
    private String mimeType;
    private Integer size;

    // region
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BlobRef getRef() {
        return ref;
    }

    public void setRef(BlobRef ref) {
        this.ref = ref;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    // endregion
}
