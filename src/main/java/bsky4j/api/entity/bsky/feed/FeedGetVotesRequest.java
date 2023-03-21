package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class FeedGetVotesRequest extends AuthRequest implements MapRequest {
    FeedGetVotesRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String cid;
    private String direction;
    private Integer limit;
    private String before;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "uri", getUri());
        addParam(map, "cid", getCid());
        addParam(map, "direction", getDirection());
        addParam(map, "limit", getLimit());
        addParam(map, "before", getBefore());
        return map;
    }

    // region
    public static FeedGetVotesRequestBuilder builder() {
        return new FeedGetVotesRequestBuilder();
    }

    public String getUri() {
        return uri;
    }

    public String getCid() {
        return cid;
    }

    public String getDirection() {
        return direction;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getBefore() {
        return before;
    }

    public static final class FeedGetVotesRequestBuilder {
        private String uri;
        private String cid;
        private String direction;
        private Integer limit;
        private String before;
        private String accessJwt;

        private FeedGetVotesRequestBuilder() {
        }

        public FeedGetVotesRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedGetVotesRequestBuilder cid(String cid) {
            this.cid = cid;
            return this;
        }

        public FeedGetVotesRequestBuilder direction(String direction) {
            this.direction = direction;
            return this;
        }

        public FeedGetVotesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetVotesRequestBuilder before(String before) {
            this.before = before;
            return this;
        }

        public FeedGetVotesRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetVotesRequest build() {
            FeedGetVotesRequest feedGetVotesRequest = new FeedGetVotesRequest(accessJwt);
            feedGetVotesRequest.uri = this.uri;
            feedGetVotesRequest.limit = this.limit;
            feedGetVotesRequest.cid = this.cid;
            feedGetVotesRequest.before = this.before;
            feedGetVotesRequest.direction = this.direction;
            return feedGetVotesRequest;
        }
    }
    // endregion
}
