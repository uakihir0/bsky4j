package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

public class EmbedRecordWithMedia implements EmbedUnion {

    @SerializedName("$type")
    private String type = BlueskyTypes.EmbedRecordWithMedia;

    private EmbedRecord record;

    /** only external and images */
    private EmbedUnion media;


    // region
    public EmbedRecord getRecord() {
        return record;
    }

    public void setRecord(EmbedRecord record) {
        this.record = record;
    }

    public EmbedUnion getMedia() {
        return media;
    }

    public void setMedia(EmbedUnion media) {
        this.media = media;
    }
    // endregion
}


