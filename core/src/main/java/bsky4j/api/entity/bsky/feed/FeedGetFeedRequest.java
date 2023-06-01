package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class FeedGetFeedRequest extends AuthRequest implements MapRequest {

    protected FeedGetFeedRequest(String accessJwt) {
        super(accessJwt);
    }

    /** at-url */
    public String feed;

    public Integer limit;

    public String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "feed", getFeed());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static FeedGetFeedRequestBuilder builder() {
        return new FeedGetFeedRequestBuilder();
    }

    public String getFeed() {
        return feed;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetFeedRequestBuilder {
        private String feed;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetFeedRequestBuilder() {
        }

        public FeedGetFeedRequestBuilder feed(String feed) {
            this.feed = feed;
            return this;
        }

        public FeedGetFeedRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetFeedRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetFeedRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetFeedRequest build() {
            FeedGetFeedRequest feedGetFeedRequest = new FeedGetFeedRequest(accessJwt);
            feedGetFeedRequest.feed = this.feed;
            feedGetFeedRequest.limit = this.limit;
            feedGetFeedRequest.cursor = this.cursor;
            return feedGetFeedRequest;
        }
    }
    // endregion
}
