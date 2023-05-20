package bsky4j.api.entity.atproto.identity;

import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class IdentityResolveHandleRequest implements MapRequest {

    /**
     * The handle to resolve. If not supplied, will resolve the host's own handle.
     */
    private String handle;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "handle", getHandle());
        return map;
    }

    // region
    public static IdentityResolveHandleRequestBuilder builder() {
        return new IdentityResolveHandleRequestBuilder();
    }

    public String getHandle() {
        return handle;
    }

    public static final class IdentityResolveHandleRequestBuilder {
        private String handle;

        private IdentityResolveHandleRequestBuilder() {
        }

        public IdentityResolveHandleRequestBuilder handle(String handle) {
            this.handle = handle;
            return this;
        }

        public IdentityResolveHandleRequest build() {
            IdentityResolveHandleRequest identityResolveHandleRequest = new IdentityResolveHandleRequest();
            identityResolveHandleRequest.handle = this.handle;
            return identityResolveHandleRequest;
        }
    }
    // endregion
}
