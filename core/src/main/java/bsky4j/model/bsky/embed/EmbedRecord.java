package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import bsky4j.model.atproto.repo.RepoStrongRef;
import com.google.gson.annotations.SerializedName;

public class EmbedRecord implements EmbedUnion {

    @SerializedName("$type")
    private String type = BlueskyTypes.EmbedRecord;

    private RepoStrongRef record;

    // region
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RepoStrongRef getRecord() {
        return record;
    }

    public void setRecord(RepoStrongRef record) {
        this.record = record;
    }
    // endregion
}
