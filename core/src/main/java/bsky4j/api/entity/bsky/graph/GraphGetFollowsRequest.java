package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphGetFollowsRequest extends AuthRequest implements MapRequest {

    protected GraphGetFollowsRequest(String accessJwt) {
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
    public static GraphGetFollowsRequestBuilder builder() {
        return new GraphGetFollowsRequestBuilder();
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

    public static final class GraphGetFollowsRequestBuilder {
        private String actor;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private GraphGetFollowsRequestBuilder() {
        }

        public GraphGetFollowsRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public GraphGetFollowsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GraphGetFollowsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public GraphGetFollowsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphGetFollowsRequest build() {
            GraphGetFollowsRequest graphGetFollowsRequest = new GraphGetFollowsRequest(accessJwt);
            graphGetFollowsRequest.actor = this.actor;
            graphGetFollowsRequest.cursor = this.cursor;
            graphGetFollowsRequest.limit = this.limit;
            return graphGetFollowsRequest;
        }
    }
    // endregion
}
