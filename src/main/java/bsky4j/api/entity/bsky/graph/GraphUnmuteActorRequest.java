package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphUnmuteActorRequest extends AuthRequest implements MapRequest {

    protected GraphUnmuteActorRequest(String accessJwt) {
        super(accessJwt);
    }

    private String actor;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        addParam(map, "actor", getActor());
        return map;
    }

    // region
    public static GraphUnmuteActorRequestBuilder builder() {
        return new GraphUnmuteActorRequestBuilder();
    }

    public String getActor() {
        return actor;
    }

    public static final class GraphUnmuteActorRequestBuilder {
        private String actor;
        private String accessJwt;

        private GraphUnmuteActorRequestBuilder() {
        }

        public GraphUnmuteActorRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public GraphUnmuteActorRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphUnmuteActorRequest build() {
            GraphUnmuteActorRequest graphUnmuteActorRequest = new GraphUnmuteActorRequest(accessJwt);
            graphUnmuteActorRequest.actor = this.actor;
            return graphUnmuteActorRequest;
        }
    }
    // endregionO
}
