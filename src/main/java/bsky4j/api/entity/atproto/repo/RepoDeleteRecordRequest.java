package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RepoDeleteRecordRequest extends AuthRequest implements MapRequest {

    RepoDeleteRecordRequest(String accessJwt) {
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
    private String rkey;

    /**
     * Compare and swap with the previous record by rid.
     */
    @Nullable
    private String swapRecord;

    /**
     * Compare and swap with the previous commit by cid.
     */
    @Nullable
    private String swapCommit;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "repo", getRepo());
        addParam(map, "collection", getCollection());
        addParam(map, "rkey", getRkey());
        addParam(map, "swapRecord", getSwapCommit());
        addParam(map, "swapCommit", getSwapCommit());
        return map;
    }

    // region
    public static RepoDeleteRecordRequestBuilder builder() {
        return new RepoDeleteRecordRequestBuilder();
    }

    public String getRepo() {
        return repo;
    }

    public String getCollection() {
        return collection;
    }

    public String getRkey() {
        return rkey;
    }

    @Nullable
    public String getSwapRecord() {
        return swapRecord;
    }

    @Nullable
    public String getSwapCommit() {
        return swapCommit;
    }

    public static final class RepoDeleteRecordRequestBuilder {
        private String repo;
        private String collection;
        private String rkey;
        private String swapRecord;
        private String swapCommit;
        private String accessJwt;

        private RepoDeleteRecordRequestBuilder() {
        }

        public RepoDeleteRecordRequestBuilder repo(String repo) {
            this.repo = repo;
            return this;
        }

        public RepoDeleteRecordRequestBuilder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public RepoDeleteRecordRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public RepoDeleteRecordRequestBuilder swapRecord(String swapRecord) {
            this.swapRecord = swapRecord;
            return this;
        }

        public RepoDeleteRecordRequestBuilder swapCommit(String swapCommit) {
            this.swapCommit = swapCommit;
            return this;
        }

        public RepoDeleteRecordRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public RepoDeleteRecordRequest build() {
            RepoDeleteRecordRequest repoDeleteRecordRequest = new RepoDeleteRecordRequest(accessJwt);
            repoDeleteRecordRequest.collection = this.collection;
            repoDeleteRecordRequest.swapCommit = this.swapCommit;
            repoDeleteRecordRequest.repo = this.repo;
            repoDeleteRecordRequest.swapRecord = this.swapRecord;
            repoDeleteRecordRequest.rkey = this.rkey;
            return repoDeleteRecordRequest;
        }
    }
    // endregion
}
