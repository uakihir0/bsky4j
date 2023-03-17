package bsky4j.api.entity.atproto.session;

import bsky4j.api.entity.share.AuthRequest;

public class SessionRefreshRequest extends AuthRequest {
    SessionRefreshRequest(String accessJwt){
        super(accessJwt);
    }

    private String refreshJwt;
    private String handle;
    private String did;

    // region

    public static SessionRefreshRequestBuilder builder() {
        return new SessionRefreshRequestBuilder();
    }

    public String getRefreshJwt() {
        return refreshJwt;
    }

    public String getHandle() {
        return handle;
    }

    public String getDid() {
        return did;
    }

    public static final class SessionRefreshRequestBuilder {
        private String accessJwt;
        private String refreshJwt;
        private String handle;
        private String did;

        private SessionRefreshRequestBuilder() {
        }

        public SessionRefreshRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public SessionRefreshRequestBuilder refreshJwt(String refreshJwt) {
            this.refreshJwt = refreshJwt;
            return this;
        }

        public SessionRefreshRequestBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public SessionRefreshRequestBuilder did(String did) {
            this.did = did;
            return this;
        }

        public SessionRefreshRequest build() {
            SessionRefreshRequest sessionRefreshRequest = new SessionRefreshRequest(accessJwt);
            sessionRefreshRequest.handle = this.handle;
            sessionRefreshRequest.did = this.did;
            sessionRefreshRequest.refreshJwt = this.refreshJwt;
            return sessionRefreshRequest;
        }
    }

    // endregion
}
