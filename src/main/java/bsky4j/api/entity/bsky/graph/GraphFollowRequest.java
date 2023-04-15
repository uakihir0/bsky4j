package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;
import bsky4j.model.bsky.feed.FeedRepost;
import bsky4j.model.bsky.graph.GraphFollow;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GraphFollowRequest extends AuthRequest implements MapRequest {

    protected GraphFollowRequest(String accessJwt) {
        super(accessJwt);
    }

    private String subject;
    private String createdAt;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "subject", getSubject());
        addParam(map, "createdAt", getCreatedAt());
        return map;
    }

    public GraphFollow toFollow() {
        GraphFollow follow = new GraphFollow();
        follow.setSubject(getSubject());
        follow.setCreatedAt(getCreatedAt());
        return follow;
    }

    // region
    public static GraphFollowRequestBuilder builder() {
        return new GraphFollowRequestBuilder();
    }

    public String getSubject() {
        return subject;
    }

    public String getCreatedAt() {
        if (createdAt == null) {
            return _InternalUtility.dateFormat.format(new Date());
        }
        return createdAt;
    }

    public static final class GraphFollowRequestBuilder {
        private String subject;
        private String createdAt;
        private String accessJwt;

        private GraphFollowRequestBuilder() {
        }

        public GraphFollowRequestBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public GraphFollowRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public GraphFollowRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphFollowRequest build() {
            GraphFollowRequest graphFollowRequest = new GraphFollowRequest(accessJwt);
            graphFollowRequest.subject = this.subject;
            graphFollowRequest.createdAt = this.createdAt;
            return graphFollowRequest;
        }
    }
    // endregion
}
