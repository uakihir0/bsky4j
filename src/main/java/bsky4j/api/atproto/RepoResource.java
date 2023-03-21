package bsky4j.api.atproto;

/**
 * ATProtocol/Repo
 * https://atproto.com/lexicons/com-atproto-repo
 */
public interface RepoResource {

    /**
     * TODO
     * Apply a batch transaction of creates, puts, and deletes.
     */
    void batchWrite();

    /**
     * Create a new record.
     */
    void createRecord();

    /**
     * Delete a record.
     */
    void deleteRecord();

    /**
     * TODO:
     * Get information about the repo, including the list of collections.
     */
    void describe();

    /**
     * TODO:
     * Fetch a record.
     */
    void getRecord();

    /**
     * TODO:
     * List a range of records in a collection.
     */
    void listRecords();

    /**
     * TODO:
     * Write a record.
     */
    void putRecord();
}
