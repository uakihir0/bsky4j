package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class FeedGetFeedGeneratorRequest extends AuthRequest implements MapRequest {
    protected FeedGetFeedGeneratorRequest(String accessJwt) {
        super(accessJwt);
    }

    /** at-uri */
    private String feed;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "feed", getFeed());
        return map;
    }

    public static FeedGetFeedGeneratorRequestBuilder builder() {
        return new FeedGetFeedGeneratorRequestBuilder();
    }

    public String getFeed() {
        return feed;
    }

    public static final class FeedGetFeedGeneratorRequestBuilder {
        private String feed;
        private String accessJwt;

        private FeedGetFeedGeneratorRequestBuilder() {
        }

        public FeedGetFeedGeneratorRequestBuilder feed(String feed) {
            this.feed = feed;
            return this;
        }

        public FeedGetFeedGeneratorRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetFeedGeneratorRequest build() {
            FeedGetFeedGeneratorRequest feedGetFeedGeneratorRequest = new FeedGetFeedGeneratorRequest(accessJwt);
            feedGetFeedGeneratorRequest.feed = this.feed;
            return feedGetFeedGeneratorRequest;
        }
    }
}
