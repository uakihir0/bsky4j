package bsky4j.model.bsky.embed;

import com.google.gson.annotations.SerializedName;

/**
 * A representation of some externally linked content, embedded in another form of content
 */
public class EmbedExternal implements EmbedUnion {

    @SerializedName("$type")
    private String type = "app.bsky.embed.external";

    private EmbedExternalExternal external;

    // region
    public EmbedExternalExternal getExternal() {
        return external;
    }

    public void setExternal(EmbedExternalExternal external) {
        this.external = external;
    }
    // endregion
}
