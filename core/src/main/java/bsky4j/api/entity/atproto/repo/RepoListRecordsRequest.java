package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RepoListRecordsRequest implements MapRequest {

    /**
     * The handle or DID of the repo.
     */
    private String repo;

    /**
     * The NSID of the record collection.
     */
    private String collection;

    /**
     * The number of records to return.
     */
    @Nullable
    private Integer limit;

    /**
     * rkey cursor.
     */
    @Nullable
    private String cursor;

    /**
     * (DEPRECATED)
     * The lowest sort-ordered rkey to start from (exclusive)
     */
    @Nullable
    private String rkeyStart;

    /**
     * (DEPRECATED)
     * The highest sort-ordered rkey to stop at (exclusive)
     */
    @Nullable
    private String rkeyEnd;

    /**
     * Reverse the order of the returned records?
     */
    @Nullable
    private Boolean reverse;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "repo", getRepo());
        addParam(map, "collection", getCollection());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        addParam(map, "rkeyStart", getRkeyStart());
        addParam(map, "rkeyEnd", getRkeyEnd());
        addParam(map, "reverse", getReverse());
        return map;
    }

    // region
    public static RepoListRecordsRequestBuilder builder() {
        return new RepoListRecordsRequestBuilder();
    }

    public String getRepo() {
        return repo;
    }

    public String getCollection() {
        return collection;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    @Nullable
    public String getRkeyStart() {
        return rkeyStart;
    }

    @Nullable
    public String getRkeyEnd() {
        return rkeyEnd;
    }

    @Nullable
    public Boolean getReverse() {
        return reverse;
    }

    public static final class RepoListRecordsRequestBuilder {
        private String repo;
        private String collection;
        private Integer limit;
        private String cursor;
        private String rkeyStart;
        private String rkeyEnd;
        private Boolean reverse;

        private RepoListRecordsRequestBuilder() {
        }

        public RepoListRecordsRequestBuilder repo(String repo) {
            this.repo = repo;
            return this;
        }

        public RepoListRecordsRequestBuilder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public RepoListRecordsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public RepoListRecordsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public RepoListRecordsRequestBuilder rkeyStart(String rkeyStart) {
            this.rkeyStart = rkeyStart;
            return this;
        }

        public RepoListRecordsRequestBuilder rkeyEnd(String rkeyEnd) {
            this.rkeyEnd = rkeyEnd;
            return this;
        }

        public RepoListRecordsRequestBuilder reverse(Boolean reverse) {
            this.reverse = reverse;
            return this;
        }

        public RepoListRecordsRequest build() {
            RepoListRecordsRequest repoListRecordsRequest = new RepoListRecordsRequest();
            repoListRecordsRequest.reverse = this.reverse;
            repoListRecordsRequest.limit = this.limit;
            repoListRecordsRequest.cursor = this.cursor;
            repoListRecordsRequest.repo = this.repo;
            repoListRecordsRequest.rkeyStart = this.rkeyStart;
            repoListRecordsRequest.rkeyEnd = this.rkeyEnd;
            repoListRecordsRequest.collection = this.collection;
            return repoListRecordsRequest;
        }
    }
    // endregion
}
