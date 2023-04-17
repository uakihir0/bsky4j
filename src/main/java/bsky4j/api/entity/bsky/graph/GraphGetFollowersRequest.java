package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphGetFollowersRequest extends AuthRequest implements MapRequest {

    protected GraphGetFollowersRequest(String accessJwt) {
        super(accessJwt);
    }

    private String actor;
    private Integer limit;
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        addParam(map, "actor", getActor());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static GraphGetFollowersRequestBuilder builder() {
        return new GraphGetFollowersRequestBuilder();
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

    public static final class GraphGetFollowersRequestBuilder {
        private String actor;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private GraphGetFollowersRequestBuilder() {
        }

        public GraphGetFollowersRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public GraphGetFollowersRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GraphGetFollowersRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public GraphGetFollowersRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphGetFollowersRequest build() {
            GraphGetFollowersRequest graphGetFollowersRequest = new GraphGetFollowersRequest(accessJwt);
            graphGetFollowersRequest.actor = this.actor;
            graphGetFollowersRequest.cursor = this.cursor;
            graphGetFollowersRequest.limit = this.limit;
            return graphGetFollowersRequest;
        }
    }
    // endregion
}
