package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

/**
 * A representation of some externally linked content, embedded in another form of content
 */
public class EmbedExternal implements EmbedUnion {

    @SerializedName("$type")
    private String type = BlueskyTypes.EmbedExternal;

    private EmbedExternalExternal external;

    // region
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EmbedExternalExternal getExternal() {
        return external;
    }

    public void setExternal(EmbedExternalExternal external) {
        this.external = external;
    }
    // endregion
}
