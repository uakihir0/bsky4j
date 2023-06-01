package bsky4j.api.entity.bsky.actor;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.Collections;
import java.util.Map;

public class ActorGetPreferencesRequest extends AuthRequest implements MapRequest {

    protected ActorGetPreferencesRequest(String accessJwt) {
        super(accessJwt);
    }

    @Override
    public Map<String, Object> toMap() {
        return Collections.emptyMap();
    }

    // region
    public static ActorGetPreferencesRequestBuilder builder() {
        return new ActorGetPreferencesRequestBuilder();
    }

    public static final class ActorGetPreferencesRequestBuilder {
        private String accessJwt;

        private ActorGetPreferencesRequestBuilder() {
        }

        public ActorGetPreferencesRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public ActorGetPreferencesRequest build() {
            return new ActorGetPreferencesRequest(accessJwt);
        }
    }
    // endregion
}
