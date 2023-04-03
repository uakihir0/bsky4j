package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FeedGetAuthorFeedRequest extends AuthRequest implements MapRequest {

    FeedGetAuthorFeedRequest(String accessJwt) {
        super(accessJwt);
    }

    private String author;
    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "author", getAuthor());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
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
    public String getCursor() {
        return cursor;
    }

    public static final class FeedGetAuthorFeedRequestBuilder {
        private String author;
        private Integer limit;
        private String cursor;
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

        public FeedGetAuthorFeedRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public FeedGetAuthorFeedRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedGetAuthorFeedRequest build() {
            FeedGetAuthorFeedRequest feedGetAuthorFeedRequest = new FeedGetAuthorFeedRequest(accessJwt);
            feedGetAuthorFeedRequest.limit = this.limit;
            feedGetAuthorFeedRequest.cursor = this.cursor;
            feedGetAuthorFeedRequest.author = this.author;
            return feedGetAuthorFeedRequest;
        }
    }
    // endregion
}
