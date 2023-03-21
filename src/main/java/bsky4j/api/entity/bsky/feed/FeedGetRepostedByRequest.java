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
    private String before;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "uri", getUri());
        addParam(map, "cid", getCid());
        addParam(map, "limit", getLimit());
        addParam(map, "before", getBefore());
        return map;
    }

    public static FeedGetRepostedByRequestBuilder builder() {
        return new FeedGetRepostedByRequestBuilder();
    }

    // region
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
    public String getBefore() {
        return before;
    }

    public static final class FeedGetRepostedByRequestBuilder {
        private String uri;
        private String cid;
        private Integer limit;
        private String before;
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

        public FeedGetRepostedByRequestBuilder before(String before) {
            this.before = before;
            return this;
        }

        public FeedGetRepostedByRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetRepostedByRequest build() {
            FeedGetRepostedByRequest feedGetRepostedByRequest = new FeedGetRepostedByRequest(accessJwt);
            feedGetRepostedByRequest.before = this.before;
            feedGetRepostedByRequest.uri = this.uri;
            feedGetRepostedByRequest.cid = this.cid;
            feedGetRepostedByRequest.limit = this.limit;
            return feedGetRepostedByRequest;
        }
    }
    // endregion
}
