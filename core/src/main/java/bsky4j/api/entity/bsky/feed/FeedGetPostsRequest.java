package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedGetPostsRequest extends AuthRequest implements MapRequest {

    protected FeedGetPostsRequest(String accessJwt) {
        super(accessJwt);
    }

    private List<String> uris;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "uris", getUris());
        return map;
    }

    // region
    public static FeedGetPostsRequestBuilder builder() {
        return new FeedGetPostsRequestBuilder();
    }

    public List<String> getUris() {
        return uris;
    }

    public static final class FeedGetPostsRequestBuilder {
        private List<String> uris;
        private String accessJwt;

        private FeedGetPostsRequestBuilder() {
        }

        public FeedGetPostsRequestBuilder uris(List<String> uris) {
            this.uris = uris;
            return this;
        }

        public FeedGetPostsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetPostsRequest build() {
            FeedGetPostsRequest feedGetPostsRequest = new FeedGetPostsRequest(accessJwt);
            feedGetPostsRequest.uris = this.uris;
            return feedGetPostsRequest;
        }
    }
    // endregion
}
