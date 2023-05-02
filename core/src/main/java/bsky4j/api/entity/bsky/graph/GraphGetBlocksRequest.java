package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphGetBlocksRequest extends AuthRequest implements MapRequest {
    protected GraphGetBlocksRequest(String accessJwt) {
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
    public static GraphGetBlocksRequestBuilder builder() {
        return new GraphGetBlocksRequestBuilder();
    }

    public Integer getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }

    public static final class GraphGetBlocksRequestBuilder {
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private GraphGetBlocksRequestBuilder() {
        }

        public GraphGetBlocksRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public GraphGetBlocksRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public GraphGetBlocksRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphGetBlocksRequest build() {
            GraphGetBlocksRequest graphGetBlocksRequest = new GraphGetBlocksRequest(accessJwt);
            graphGetBlocksRequest.limit = this.limit;
            graphGetBlocksRequest.cursor = this.cursor;
            return graphGetBlocksRequest;
        }
    }
    // endregion
}
