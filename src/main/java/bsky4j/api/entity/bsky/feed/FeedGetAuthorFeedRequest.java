package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.JsonRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetAuthorFeedRequest extends AuthRequest implements JsonRequest {

    FeedGetAuthorFeedRequest(String accessJwt) {
        super(accessJwt);
    }

    private String author;
    @Nullable
    private Integer limit;
    @Nullable
    private String before;

    @Override
    public Map<String, Object> toJsonMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "author", getAuthor());
        addParam(map, "limit", getLimit());
        addParam(map, "before", getBefore());
        return map;
    }

    // region

    public static FeedGetAuthorFeedRequestBuilder builder() {
        return new FeedGetAuthorFeedRequestBuilder();
    }

    public String getAuthor() {
        return author;
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getBefore() {
        return before;
    }

    public static final class FeedGetAuthorFeedRequestBuilder {
        private String author;
        private Integer limit;
        private String before;
        private String accessJwt;

        private FeedGetAuthorFeedRequestBuilder() {
        }

        public FeedGetAuthorFeedRequestBuilder author(String author) {
            this.author = author;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder before(String before) {
            this.before = before;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetAuthorFeedRequest build() {
            FeedGetAuthorFeedRequest feedGetAuthorFeedRequest = new FeedGetAuthorFeedRequest(accessJwt);
            feedGetAuthorFeedRequest.limit = this.limit;
            feedGetAuthorFeedRequest.author = this.author;
            feedGetAuthorFeedRequest.before = this.before;
            return feedGetAuthorFeedRequest;
        }
    }

    // endregion
}
