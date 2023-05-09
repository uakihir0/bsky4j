package bsky4j.api.entity.bsky.actor;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActorGetProfilesRequest extends AuthRequest implements MapRequest {

    protected ActorGetProfilesRequest(String accessJwt) {
        super(accessJwt);
    }

    private List<String> actors;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "actors", getActors());
        return map;
    }

    // region
    public static ActorGetProfilesRequestBuilder builder() {
        return new ActorGetProfilesRequestBuilder();
    }

    public List<String> getActors() {
        return actors;
    }

    public static final class ActorGetProfilesRequestBuilder {
        private List<String> actors;
        private String accessJwt;

        private ActorGetProfilesRequestBuilder() {
        }

        public ActorGetProfilesRequestBuilder actors(List<String> actors) {
            this.actors = actors;
            return this;
        }

        public ActorGetProfilesRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public ActorGetProfilesRequest build() {
            ActorGetProfilesRequest actorGetProfilesRequest = new ActorGetProfilesRequest(accessJwt);
            actorGetProfilesRequest.actors = this.actors;
            return actorGetProfilesRequest;
        }
    }
    // endregion
}
