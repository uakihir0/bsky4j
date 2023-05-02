package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;
import bsky4j.model.bsky.graph.GraphBlock;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GraphBlockRequest extends AuthRequest implements MapRequest {

    protected GraphBlockRequest(String accessJwt) {
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

    // region
    public GraphBlock toBlock() {
        GraphBlock block = new GraphBlock();
        block.setSubject(getSubject());
        block.setCreatedAt(getCreatedAt());
        return block;
    }

    public static GraphBlockRequestBuilder builder() {
        return new GraphBlockRequestBuilder();
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

    public static final class GraphBlockRequestBuilder {
        private String subject;
        private String createdAt;
        private String accessJwt;

        private GraphBlockRequestBuilder() {
        }


        public GraphBlockRequestBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public GraphBlockRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public GraphBlockRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphBlockRequest build() {
            GraphBlockRequest graphBlockRequest = new GraphBlockRequest(accessJwt);
            graphBlockRequest.createdAt = this.createdAt;
            graphBlockRequest.subject = this.subject;
            return graphBlockRequest;
        }
    }
    // endregion
}
