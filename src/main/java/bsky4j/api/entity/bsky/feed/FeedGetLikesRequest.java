package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetLikesRequest extends AuthRequest implements MapRequest {
    FeedGetLikesRequest(String accessJwt) {
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
    public static FeedGetLikesRequestBuilder builder() {
        return new FeedGetLikesRequestBuilder();
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

    public static final class FeedGetLikesRequestBuilder {
        private String uri;
        private String cid;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetLikesRequestBuilder() {
        }

        public FeedGetLikesRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedGetLikesRequestBuilder cid(String cid) {
            this.cid = cid;
            return this;
        }

        public FeedGetLikesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetLikesRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetLikesRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetLikesRequest build() {
            FeedGetLikesRequest feedGetLikesRequest = new FeedGetLikesRequest(accessJwt);
            feedGetLikesRequest.limit = this.limit;
            feedGetLikesRequest.uri = this.uri;
            feedGetLikesRequest.cid = this.cid;
            feedGetLikesRequest.cursor = this.cursor;
            return feedGetLikesRequest;
        }
    }
    // endregion
}
