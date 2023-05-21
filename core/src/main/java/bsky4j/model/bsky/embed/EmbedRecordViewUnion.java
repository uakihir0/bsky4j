package bsky4j.model.bsky.embed;

/**
 * @see EmbedRecordViewRecord
 * @see EmbedRecordViewNotFound
 * @see EmbedRecordViewBlocked
 */
public interface EmbedRecordViewUnion {
    String getType();
}
