package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetTimelineRequest extends AuthRequest implements MapRequest {

    FeedGetTimelineRequest(String accessJwt) {
        super(accessJwt);
    }

    @Nullable
    private String algorithm;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "algorithm", getAlgorithm());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static FeedGetTimelineRequestBuilder builder() {
        return new FeedGetTimelineRequestBuilder();
    }

    @Nullable
    public String getAlgorithm() {
        return algorithm;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetTimelineRequestBuilder {
        private String algorithm;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private FeedGetTimelineRequestBuilder() {
        }

        public FeedGetTimelineRequestBuilder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public FeedGetTimelineRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetTimelineRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetTimelineRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetTimelineRequest build() {
            FeedGetTimelineRequest feedGetTimelineRequest = new FeedGetTimelineRequest(accessJwt);
            feedGetTimelineRequest.cursor = this.cursor;
            feedGetTimelineRequest.algorithm = this.algorithm;
            feedGetTimelineRequest.limit = this.limit;
            return feedGetTimelineRequest;
        }
    }
}