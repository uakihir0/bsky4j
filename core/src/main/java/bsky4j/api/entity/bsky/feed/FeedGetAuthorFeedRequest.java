package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetAuthorFeedRequest extends AuthRequest implements MapRequest {

    FeedGetAuthorFeedRequest(String accessJwt) {
        super(accessJwt);
    }

    private String actor;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "actor", getActor());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static FeedGetAuthorFeedRequestBuilder builder() {
        return new FeedGetAuthorFeedRequestBuilder();
    }

    public String getActor() {
        return actor;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetAuthorFeedRequestBuilder {
        private String actor;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetAuthorFeedRequestBuilder() {
        }

        public FeedGetAuthorFeedRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetAuthorFeedRequest build() {
            FeedGetAuthorFeedRequest feedGetAuthorFeedRequest = new FeedGetAuthorFeedRequest(accessJwt);
            feedGetAuthorFeedRequest.cursor = this.cursor;
            feedGetAuthorFeedRequest.limit = this.limit;
            feedGetAuthorFeedRequest.actor = this.actor;
            return feedGetAuthorFeedRequest;
        }
    }
    // endregion
}
