package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.api.entity.share.RecordUnion;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RepoCreateRecordRequest extends AuthRequest implements MapRequest {

    RepoCreateRecordRequest(String accessJwt) {
        super(accessJwt);
    }

    /**
     * The DID of the repo.
     */
    private String did;

    /**
     * The NSID of the record collection.
     */
    private String collection;

    /**
     * Validate the record?
     */
    @Nullable
    private Boolean validate;

    /**
     * The record to create.
     */
    private RecordUnion record;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "did", getDid());
        addParam(map, "collection", getCollection());
        addParam(map, "validate", getValidate());
        addParam(map, "record", getRecord());
        return map;
    }

    // region
    public static RepoCreateRecordRequestBuilder builder() {
        return new RepoCreateRecordRequestBuilder();
    }

    public String getDid() {
        return did;
    }

    public String getCollection() {
        return collection;
    }

    @Nullable
    public Boolean getValidate() {
        return validate;
    }

    public RecordUnion getRecord() {
        return record;
    }

    public static final class RepoCreateRecordRequestBuilder {
        private String did;
        private String collection;
        private Boolean validate;
        private RecordUnion record;
        private String accessJwt;

        private RepoCreateRecordRequestBuilder() {
        }


        public RepoCreateRecordRequestBuilder did(String did) {
            this.did = did;
            return this;
        }

        public RepoCreateRecordRequestBuilder collection(String collection) {
            this.collection = collection;
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

        public RepoCreateRecordRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public RepoCreateRecordRequest build() {
            RepoCreateRecordRequest repoCreateRecordRequest = new RepoCreateRecordRequest(accessJwt);
            repoCreateRecordRequest.collection = this.collection;
            repoCreateRecordRequest.did = this.did;
            repoCreateRecordRequest.record = this.record;
            repoCreateRecordRequest.validate = this.validate;
            return repoCreateRecordRequest;
        }
    }
    // endregion
}
