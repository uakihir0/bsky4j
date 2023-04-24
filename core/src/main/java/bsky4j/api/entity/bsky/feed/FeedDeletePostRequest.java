package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.util.ATUriParser;

/**
 * Uri includes the rkey.
 * so, uri or rkey is enough.
 */
public class FeedDeletePostRequest extends AuthRequest {

    FeedDeletePostRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String rkey;

    // region
    public static FeedDeletePostRequestBuilder builder() {
        return new FeedDeletePostRequestBuilder();
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

    public static final class FeedDeletePostRequestBuilder {
        private String uri;
        private String rkey;
        private String accessJwt;

        private FeedDeletePostRequestBuilder() {
        }

        public FeedDeletePostRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedDeletePostRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public FeedDeletePostRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedDeletePostRequest build() {
            FeedDeletePostRequest feedDeletePostRequest = new FeedDeletePostRequest(accessJwt);
            feedDeletePostRequest.uri = this.uri;
            feedDeletePostRequest.rkey = this.rkey;
            return feedDeletePostRequest;
        }
    }
    // endregion
}
