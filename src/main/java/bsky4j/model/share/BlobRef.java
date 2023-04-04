package bsky4j.model.share;

import com.google.gson.annotations.SerializedName;

public class BlobRef {

    @SerializedName("$link")
    private String link;

    // region
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    // endregion
}
