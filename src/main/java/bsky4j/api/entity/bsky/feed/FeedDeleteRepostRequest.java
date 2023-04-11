package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.util.ATUriParser;

/**
 * Uri includes the rkey.
 * so, uri or rkey is enough.
 */
public class FeedDeleteRepostRequest extends AuthRequest {

    FeedDeleteRepostRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String rkey;

    // region
    public static FeedDeleteRepostRequestBuilder builder() {
        return new FeedDeleteRepostRequestBuilder();
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

    public static final class FeedDeleteRepostRequestBuilder {
        private String uri;
        private String rkey;
        private String accessJwt;

        private FeedDeleteRepostRequestBuilder() {
        }

        public FeedDeleteRepostRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedDeleteRepostRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public FeedDeleteRepostRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedDeleteRepostRequest build() {
            FeedDeleteRepostRequest feedDeleteRepostRequest = new FeedDeleteRepostRequest(accessJwt);
            feedDeleteRepostRequest.uri = this.uri;
            feedDeleteRepostRequest.rkey = this.rkey;
            return feedDeleteRepostRequest;
        }
    }
    // endregion
}
