package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;

public class GraphDeleteBlockRequest extends AuthRequest {

    protected GraphDeleteBlockRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String rkey;

    // region
    public static GraphDeleteBlockRequestBuilder builder() {
        return new GraphDeleteBlockRequestBuilder();
    }

    public String getUri() {
        return uri;
    }

    public String getRkey() {
        return rkey;
    }

    public static final class GraphDeleteBlockRequestBuilder {
        private String uri;
        private String rkey;
        private String accessJwt;

        private GraphDeleteBlockRequestBuilder() {
        }

        public GraphDeleteBlockRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GraphDeleteBlockRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public GraphDeleteBlockRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphDeleteBlockRequest build() {
            GraphDeleteBlockRequest graphDeleteBlockRequest = new GraphDeleteBlockRequest(accessJwt);
            graphDeleteBlockRequest.rkey = this.rkey;
            graphDeleteBlockRequest.uri = this.uri;
            return graphDeleteBlockRequest;
        }
    }
    // endregion
}
