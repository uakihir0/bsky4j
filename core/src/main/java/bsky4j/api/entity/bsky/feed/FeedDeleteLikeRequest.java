package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.util.ATUriParser;

/**
 * Uri includes the rkey.
 * so, uri or rkey is enough.
 */
public class FeedDeleteLikeRequest extends AuthRequest {

    FeedDeleteLikeRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    private String rkey;

    // region
    public static FeedDeleteLikeRequestBuilder builder() {
        return new FeedDeleteLikeRequestBuilder();
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

    public static final class FeedDeleteLikeRequestBuilder {
        private String uri;
        private String rkey;
        private String accessJwt;

        private FeedDeleteLikeRequestBuilder() {
        }

        public FeedDeleteLikeRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedDeleteLikeRequestBuilder rkey(String rkey) {
            this.rkey = rkey;
            return this;
        }

        public FeedDeleteLikeRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedDeleteLikeRequest build() {
            FeedDeleteLikeRequest feedDeleteLikeRequest = new FeedDeleteLikeRequest(accessJwt);
            feedDeleteLikeRequest.rkey = this.rkey;
            feedDeleteLikeRequest.uri = this.uri;
            return feedDeleteLikeRequest;
        }
    }
    // endregion
}
