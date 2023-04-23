package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.model.share.RecordUnion;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RepoCreateRecordRequest extends AuthRequest implements MapRequest {

    RepoCreateRecordRequest(String accessJwt) {
        super(accessJwt);
    }

    /**
     * The handle or DID of the repo.
     */
    private String repo;

    /**
     * The NSID of the record collection.
     */
    private String collection;

    /**
     * The key of the record.
     */
    @Nullable
    private String rkey;

    /**
     * Validate the record?
     */
    @Nullable
    private Boolean validate;

    /**
     * The record to create.
     */
    private RecordUnion record;

    /**
     * Compare and swap with the previous commit by cid."
     */
    @Nullable
    private String swapCommit;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "repo", getRepo());
        addParam(map, "collection", getCollection());
        addParam(map, "rkey", getRkey());
        addParam(map, "validate", getValidate());
        addParam(map, "record", getRecord());
        addParam(map, "swapCommit", getSwapCommit());
        return map;
    }

    // region
    public static RepoCreateRecordRequestBuilder builder() {
        return new RepoCreateRecordRequestBuilder();
    }

    public String getRepo() {
        return repo;
    }

    public String getCollection() {
        return collection;
    }

    @Nullable
    public String getRkey() {
        return rkey;
    }

    @Nullable
    public Boolean getValidate() {
        return validate;
    }

    public RecordUnion getRecord() {
        return record;
    }

    @Nullable
    public String getSwapCommit() {
        return swapCommit;
    }

    public static final class RepoCreateRecordRequestBuilder {
        private String repo;
        private String collection;
        private String rkey;
        private Boolean validate;
        private RecordUnion record;
        private String swapCommit;
        private String accessJwt;

        private RepoCreateRecordRequestBuilder() {
        }

        public RepoCreateRecordRequestBuilder repo(String repo) {
            this.repo = repo;
            return this;
        }

        public RepoCreateRecordRequestBuilder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public RepoCreateRecordRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public RepoCreateRecordRequestBuilder validate(Boolean validate) {
            this.validate = validate;
            return this;
        }

        public RepoCreateRecordRequestBuilder record(RecordUnion record) {
            this.record = record;
            return this;
        }

        public RepoCreateRecordRequestBuilder swapCommit(String swapCommit) {
            this.swapCommit = swapCommit;
            return this;
        }

        public RepoCreateRecordRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public RepoCreateRecordRequest build() {
            RepoCreateRecordRequest repoCreateRecordRequest = new RepoCreateRecordRequest(accessJwt);
            repoCreateRecordRequest.record = this.record;
            repoCreateRecordRequest.validate = this.validate;
            repoCreateRecordRequest.swapCommit = this.swapCommit;
            repoCreateRecordRequest.repo = this.repo;
            repoCreateRecordRequest.rkey = this.rkey;
            repoCreateRecordRequest.collection = this.collection;
            return repoCreateRecordRequest;
        }
    }
}