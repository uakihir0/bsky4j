package bsky4j.api.entity.atproto.server;

import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class ServerCreateSessionRequest implements MapRequest {

    private String identifier;
    private String password;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "identifier", getIdentifier());
        addParam(map, "password", getPassword());
        return map;
    }

    // region
    public static ServerCreateSessionRequestBuilder builder() {
        return new ServerCreateSessionRequestBuilder();
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getPassword() {
        return password;
    }

    public static final class ServerCreateSessionRequestBuilder {
        private String identifier;
        private String password;

        private ServerCreateSessionRequestBuilder() {
        }

        public ServerCreateSessionRequestBuilder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public ServerCreateSessionRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public ServerCreateSessionRequest build() {
            ServerCreateSessionRequest sessionCreateRequest = new ServerCreateSessionRequest();
            sessionCreateRequest.identifier = this.identifier;
            sessionCreateRequest.password = this.password;
            return sessionCreateRequest;
        }
    }
    // endregion
}
