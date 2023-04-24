package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;
import bsky4j.model.atproto.repo.RepoStrongRef;
import bsky4j.model.bsky.feed.FeedRepost;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FeedRepostRequest extends AuthRequest implements MapRequest {
    FeedRepostRequest(String accessJwt) {
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

    public FeedRepost toRepost() {
        FeedRepost repost = new FeedRepost();
        repost.setSubject(getSubject());
        repost.setCreatedAt(getCreatedAt());
        return repost;
    }

    // region
    public static FeedRepostRequestBuilder builder() {
        return new FeedRepostRequestBuilder();
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

    public static final class FeedRepostRequestBuilder {
        private RepoStrongRef subject;
        private String createdAt;
        private String accessJwt;

        private FeedRepostRequestBuilder() {
        }

        public FeedRepostRequestBuilder subject(RepoStrongRef subject) {
            this.subject = subject;
            return this;
        }

        public FeedRepostRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FeedRepostRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedRepostRequest build() {
            FeedRepostRequest feedRepostRequest = new FeedRepostRequest(accessJwt);
            feedRepostRequest.createdAt = this.createdAt;
            feedRepostRequest.subject = this.subject;
            return feedRepostRequest;
        }
    }
    // endregion
}
