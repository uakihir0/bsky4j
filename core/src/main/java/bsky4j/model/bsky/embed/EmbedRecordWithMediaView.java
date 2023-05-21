package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;

public class EmbedRecordWithMediaView implements EmbedViewUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecordWithMedia + "#view";

    @Override
    public String getType() {
        return TYPE;
    }

    private EmbedRecordView record;

    /** only external and images */
    private EmbedViewUnion media;

    // region
    public EmbedRecordView getRecord() {
        return record;
    }

    public void setRecord(EmbedRecordView record) {
        this.record = record;
    }

    public EmbedViewUnion getMedia() {
        return media;
    }

    public void setMedia(EmbedViewUnion media) {
        this.media = media;
    }
    // endregion
}
