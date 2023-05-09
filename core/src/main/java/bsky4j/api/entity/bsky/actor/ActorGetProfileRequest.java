package bsky4j.api.entity.bsky.actor;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class ActorGetProfileRequest extends AuthRequest implements MapRequest {

    protected ActorGetProfileRequest(String accessJwt) {
        super(accessJwt);
    }

    private String actor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "actor", getActor());
        return map;
    }

    // region
    public static ActorGetProfileRequestBuilder builder() {
        return new ActorGetProfileRequestBuilder();
    }

    public String getActor() {
        return actor;
    }

    public static final class ActorGetProfileRequestBuilder {
        private String actor;
        private String accessJwt;

        private ActorGetProfileRequestBuilder() {
        }

        public ActorGetProfileRequestBuilder actor(String actor) {
            this.actor = actor;
            return this;
        }

        public ActorGetProfileRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public ActorGetProfileRequest build() {
            ActorGetProfileRequest actorGetProfileRequest = new ActorGetProfileRequest(accessJwt);
            actorGetProfileRequest.actor = this.actor;
            return actorGetProfileRequest;
        }
    }
    // endregion
}
