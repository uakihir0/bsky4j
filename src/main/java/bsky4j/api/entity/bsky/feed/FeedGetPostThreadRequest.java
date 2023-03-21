package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetPostThreadRequest extends AuthRequest implements MapRequest {
    FeedGetPostThreadRequest(String accessJwt) {
        super(accessJwt);
    }

    private String uri;
    @Nullable
    private Integer depth;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "uri", getUri());
        addParam(map, "depth", getDepth());
        return map;
    }

    // region
    public static FeedGetPostThreadRequestBuilder builder() {
        return new FeedGetPostThreadRequestBuilder();
    }

    public String getUri() {
        return uri;
    }

    @Nullable
    public Integer getDepth() {
        return depth;
    }

    public static final class FeedGetPostThreadRequestBuilder {
        private String uri;
        private Integer depth;
        private String accessJwt;

        private FeedGetPostThreadRequestBuilder() {
        }


        public FeedGetPostThreadRequestBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public FeedGetPostThreadRequestBuilder depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        public FeedGetPostThreadRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetPostThreadRequest build() {
            FeedGetPostThreadRequest feedGetPostThreadRequest = new FeedGetPostThreadRequest(accessJwt);
            feedGetPostThreadRequest.depth = this.depth;
            feedGetPostThreadRequest.uri = this.uri;
            return feedGetPostThreadRequest;
        }
    }

    // endregion
}
