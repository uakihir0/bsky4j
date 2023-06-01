package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class FeedGetActorFeedsRequest extends AuthRequest implements MapRequest {

    protected FeedGetActorFeedsRequest(String accessJwt) {
        super(accessJwt);
    }

    private String actor;
    private Integer limit;
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
    public static FeedGetActorFeedsRequestBuilder builder() {
        return new FeedGetActorFeedsRequestBuilder();
    }

    public String getActor() {
        return actor;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetActorFeedsRequestBuilder {
        private String actor;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetActorFeedsRequestBuilder() {
        }

        public FeedGetActorFeedsRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public FeedGetActorFeedsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetActorFeedsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetActorFeedsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetActorFeedsRequest build() {
            FeedGetActorFeedsRequest feedGetActorFeedsRequest = new FeedGetActorFeedsRequest(accessJwt);
            feedGetActorFeedsRequest.limit = this.limit;
            feedGetActorFeedsRequest.actor = this.actor;
            feedGetActorFeedsRequest.cursor = this.cursor;
            return feedGetActorFeedsRequest;
        }
    }
    // endregion
}
