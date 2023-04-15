package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.util.ATUriParser;

public class GraphDeleteFollowRequest  extends AuthRequest {

    protected GraphDeleteFollowRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String rkey;

    // region
    public static GraphDeleteFollowRequestBuilder builder() {
        return new GraphDeleteFollowRequestBuilder();
    }

    public String getUri() {
        return uri;
    }

    public String getRkey() {
        if (rkey != null) {
            return rkey;
        }
        if (uri != null) {
            return ATUriParser.getRKey(uri);
        }
        return null;
    }


    public static final class GraphDeleteFollowRequestBuilder {
        private String uri;
        private String rkey;
        private String accessJwt;

        private GraphDeleteFollowRequestBuilder() {
        }

        public GraphDeleteFollowRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GraphDeleteFollowRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public GraphDeleteFollowRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphDeleteFollowRequest build() {
            GraphDeleteFollowRequest graphDeleteFollowRequest = new GraphDeleteFollowRequest(accessJwt);
            graphDeleteFollowRequest.uri = this.uri;
            graphDeleteFollowRequest.rkey = this.rkey;
            return graphDeleteFollowRequest;
        }
    }
    // endregion
}
