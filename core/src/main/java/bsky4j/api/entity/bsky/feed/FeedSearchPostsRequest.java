package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedSearchPostsRequest extends AuthRequest implements MapRequest {

    FeedSearchPostsRequest(String accessJwt) {
        super(accessJwt);
    }

    private String q;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "q", getQ());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static FeedSearchPostsRequestBuilder builder() {
        return new FeedSearchPostsRequestBuilder();
    }

    public String getQ() {
        return q;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class FeedSearchPostsRequestBuilder {
        private String q;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedSearchPostsRequestBuilder() {
        }

        public FeedSearchPostsRequestBuilder q(String q) {
            this.q = q;
            return this;
        }

        public FeedSearchPostsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedSearchPostsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedSearchPostsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedSearchPostsRequest build() {
            FeedSearchPostsRequest feedSearchPostsRequest = new FeedSearchPostsRequest(accessJwt);
            feedSearchPostsRequest.cursor = this.cursor;
            feedSearchPostsRequest.limit = this.limit;
            feedSearchPostsRequest.q = this.q;
            return feedSearchPostsRequest;
        }
    }
    // endregion
}
