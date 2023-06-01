package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedGetFeedGeneratorsRequest extends AuthRequest implements MapRequest {

    protected FeedGetFeedGeneratorsRequest(String accessJwt) {
        super(accessJwt);
    }

    /** at-uri */
    private List<String> feeds;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "feeds", getFeeds());
        return map;
    }

    // region
    public static FeedGetFeedGeneratorsRequestBuilder builder() {
        return new FeedGetFeedGeneratorsRequestBuilder();
    }

    public List<String> getFeeds() {
        return feeds;
    }

    public static final class FeedGetFeedGeneratorsRequestBuilder {
        private List<String> feeds;
        private String accessJwt;

        private FeedGetFeedGeneratorsRequestBuilder() {
        }

        public FeedGetFeedGeneratorsRequestBuilder feeds(List<String> feeds) {
            this.feeds = feeds;
            return this;
        }

        public FeedGetFeedGeneratorsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetFeedGeneratorsRequest build() {
            FeedGetFeedGeneratorsRequest feedGetFeedGeneratorsRequest = new FeedGetFeedGeneratorsRequest(accessJwt);
            feedGetFeedGeneratorsRequest.feeds = this.feeds;
            return feedGetFeedGeneratorsRequest;
        }
    }
    // endregion
}
