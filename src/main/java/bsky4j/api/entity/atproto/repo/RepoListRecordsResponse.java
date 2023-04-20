package bsky4j.api.entity.atproto.repo;

import bsky4j.model.atproto.repo.RepoListRecordsRecord;

import java.util.List;

public class RepoListRecordsResponse {

    private String cursor;
    private List<RepoListRecordsRecord> records;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<RepoListRecordsRecord> getRecords() {
        return records;
    }

    public void setRecords(List<RepoListRecordsRecord> records) {
        this.records = records;
    }
    // endregion
}
