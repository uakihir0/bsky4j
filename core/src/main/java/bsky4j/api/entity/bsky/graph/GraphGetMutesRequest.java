package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphGetMutesRequest extends AuthRequest implements MapRequest {

    protected GraphGetMutesRequest(String accessJwt) {
        super(accessJwt);
    }

    private Integer limit;
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static GraphGetMutesRequestBuilder builder() {
        return new GraphGetMutesRequestBuilder();
    }

    public Integer getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }

    public static final class GraphGetMutesRequestBuilder {
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private GraphGetMutesRequestBuilder() {
        }

        public GraphGetMutesRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GraphGetMutesRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public GraphGetMutesRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphGetMutesRequest build() {
            GraphGetMutesRequest graphGetMutesRequest = new GraphGetMutesRequest(accessJwt);
            graphGetMutesRequest.cursor = this.cursor;
            graphGetMutesRequest.limit = this.limit;
            return graphGetMutesRequest;
        }
    }
    // endregion
}
