package bsky4j.model.bsky.embed;

/**
 * @see EmbedExternalView
 * @see EmbedImagesView
 * @see EmbedRecordView
 * @see EmbedRecordWithMediaView
 */
public interface EmbedViewUnion {
    String getType();
}
