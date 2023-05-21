package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;


/**
 * A representation of a record embedded in another form of content
 */
public class EmbedRecordView implements EmbedViewUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#view";

    @Override
    public String getType() {
        return TYPE;
    }

    private EmbedRecordViewUnion record;

    // region
    public EmbedRecordViewUnion getRecord() {
        return record;
    }

    public void setRecord(EmbedRecordViewUnion record) {
        this.record = record;
    }
    // endregion
}
