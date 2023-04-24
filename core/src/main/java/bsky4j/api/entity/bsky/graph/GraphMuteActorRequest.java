package bsky4j.api.entity.bsky.graph;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class GraphMuteActorRequest extends AuthRequest implements MapRequest {

    protected GraphMuteActorRequest(String accessJwt) {
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
    public static GraphMuteActorRequestBuilder builder() {
        return new GraphMuteActorRequestBuilder();
    }

    public String getActor() {
        return actor;
    }

    public static final class GraphMuteActorRequestBuilder {
        private String actor;
        private String accessJwt;

        private GraphMuteActorRequestBuilder() {
        }

        public GraphMuteActorRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public GraphMuteActorRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public GraphMuteActorRequest build() {
            GraphMuteActorRequest graphMuteActorRequest = new GraphMuteActorRequest(accessJwt);
            graphMuteActorRequest.actor = this.actor;
            return graphMuteActorRequest;
        }
    }
    // endregion
}
