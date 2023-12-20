package bsky4j.api.entity.bsky.feed;

import java.util.HashMap;
import java.util.Map;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

public class FeedGetActorLikesRequest extends AuthRequest implements MapRequest {

    protected FeedGetActorLikesRequest(String accessJwt) {
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
    public static Builder builder() {
        return new Builder();
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

    public static final class Builder {
        private String actor;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private Builder() {
        }

        public Builder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetActorLikesRequest build() {
            FeedGetActorLikesRequest request = new FeedGetActorLikesRequest(accessJwt);
            request.limit = this.limit;
            request.actor = this.actor;
            request.cursor = this.cursor;
            return request;
        }
    }
    // endregion
}
