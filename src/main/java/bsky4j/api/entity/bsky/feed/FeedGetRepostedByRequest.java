package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetRepostedByRequest extends AuthRequest implements MapRequest {

    FeedGetRepostedByRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    @Nullable
    private String cid;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "uri", getUri());
        addParam(map, "cid", getCid());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static FeedGetRepostedByRequestBuilder builder() {
        return new FeedGetRepostedByRequestBuilder();
    }

    public String getUri() {
        return uri;
    }

    @Nullable
    public String getCid() {
        return cid;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetRepostedByRequestBuilder {
        private String uri;
        private String cid;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetRepostedByRequestBuilder() {
        }

        public FeedGetRepostedByRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedGetRepostedByRequestBuilder cid(String cid) {
            this.cid = cid;
            return this;
        }

        public FeedGetRepostedByRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetRepostedByRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetRepostedByRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetRepostedByRequest build() {
            FeedGetRepostedByRequest feedGetRepostedByRequest = new FeedGetRepostedByRequest(accessJwt);
            feedGetRepostedByRequest.cid = this.cid;
            feedGetRepostedByRequest.limit = this.limit;
            feedGetRepostedByRequest.uri = this.uri;
            feedGetRepostedByRequest.cursor = this.cursor;
            return feedGetRepostedByRequest;
        }
    }
}