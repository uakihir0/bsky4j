package bsky4j.api.entity.atproto.session;

import bsky4j.api.entity.share.JsonRequest;

import java.util.HashMap;
import java.util.Map;

public class SessionCreateRequest implements JsonRequest {

    private String handle;
    private String identifier;
    private String password;

    @Override
    public Map<String, Object> toJsonMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "handle", getHandle());
        addParam(map, "identifier", getIdentifier());
        addParam(map, "password", getPassword());
        return map;
    }

    // region

    public static SessionCreateRequestBuilder builder() {
        return new SessionCreateRequestBuilder();
    }

    public String getHandle() {
        return handle;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getPassword() {
        return password;
    }

    public static final class SessionCreateRequestBuilder {
        private String handle;
        private String identifier;
        private String password;

        private SessionCreateRequestBuilder() {
        }

        public SessionCreateRequestBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public SessionCreateRequestBuilder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public SessionCreateRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public SessionCreateRequest build() {
            SessionCreateRequest sessionCreateRequest = new SessionCreateRequest();
            sessionCreateRequest.identifier = this.identifier;
            sessionCreateRequest.password = this.password;
            sessionCreateRequest.handle = this.handle;
            return sessionCreateRequest;
        }
    }

    // endregion
}
