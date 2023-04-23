package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.MapRequest;
import bsky4j.util.ATUriParser;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RepoGetRecordRequest implements MapRequest {

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
     * (Library optional)
     */
    private String uri;

    /**
     * The CID of the version of the record. If not specified, then return the most recent version.
     */
    @Nullable
    private String cid;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "repo", getRepo());
        addParam(map, "collection", getCollection());
        addParam(map, "rkey", getRkey());
        addParam(map, "cid", getCid());
        return map;
    }

    // region
    public static RepoGetRecordRequestBuilder builder() {
        return new RepoGetRecordRequestBuilder();
    }

    public String getRepo() {
        return repo;
    }

    public String getCollection() {
        return collection;
    }

    public String getRkey() {
        if (rkey != null) {
            return rkey;
        }
        if (uri != null) {
            return ATUriParser.getRKey(uri);
        }
        return null;
    }

    public String getUri() {
        return uri;
    }

    public String getCid() {
        return cid;
    }

    public static final class RepoGetRecordRequestBuilder {
        private String repo;
        private String collection;
        private String rkey;
        private String uri;
        private String cid;

        private RepoGetRecordRequestBuilder() {
        }

        public RepoGetRecordRequestBuilder repo(String repo) {
            this.repo = repo;
            return this;
        }

        public RepoGetRecordRequestBuilder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public RepoGetRecordRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public RepoGetRecordRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public RepoGetRecordRequestBuilder cid(String cid) {
            this.cid = cid;
            return this;
        }

        public RepoGetRecordRequest build() {
            RepoGetRecordRequest repoGetRecordRequest = new RepoGetRecordRequest();
            repoGetRecordRequest.collection = this.collection;
            repoGetRecordRequest.cid = this.cid;
            repoGetRecordRequest.repo = this.repo;
            repoGetRecordRequest.rkey = this.rkey;
            repoGetRecordRequest.uri = this.uri;
            return repoGetRecordRequest;
        }
    }
    // endregion
}
