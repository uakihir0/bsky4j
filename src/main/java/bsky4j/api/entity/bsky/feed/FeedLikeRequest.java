package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;
import bsky4j.model.atproto.repo.RepoStrongRef;
import bsky4j.model.bsky.feed.FeedLike;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FeedLikeRequest extends AuthRequest implements MapRequest {
    FeedLikeRequest(String accessJwt) {
        super(accessJwt);
    }

    private RepoStrongRef subject;
    private String createdAt;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "subject", getSubject());
        addParam(map, "createdAt", getCreatedAt());
        return map;
    }

    public FeedLike toLike() {
        FeedLike like = new FeedLike();
        like.setSubject(getSubject());
        like.setCreatedAt(getCreatedAt());
        return like;
    }

    public static FeedLikeRequestBuilder builder() {
        return new FeedLikeRequestBuilder();
    }

    public RepoStrongRef getSubject() {
        return subject;
    }

    public String getCreatedAt() {
        if (createdAt == null) {
            return _InternalUtility.dateFormat.format(new Date());
        }
        return createdAt;
    }

    public static final class FeedLikeRequestBuilder {
        private RepoStrongRef subject;
        private String createdAt;
        private String accessJwt;

        private FeedLikeRequestBuilder() {
        }

        public FeedLikeRequestBuilder subject(RepoStrongRef subject) {
            this.subject = subject;
            return this;
        }

        public FeedLikeRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FeedLikeRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedLikeRequest build() {
            FeedLikeRequest feedLikeRequest = new FeedLikeRequest(accessJwt);
            feedLikeRequest.subject = this.subject;
            feedLikeRequest.createdAt = this.createdAt;
            return feedLikeRequest;
        }
    }
}
