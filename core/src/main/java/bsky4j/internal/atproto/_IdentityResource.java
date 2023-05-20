package bsky4j.internal.atproto;

import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.IdentityResource;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleRequest;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleResponse;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;
import static bsky4j.internal.share._InternalUtility.xrpc;

public class _IdentityResource implements IdentityResource {

    private final String uri;

    public _IdentityResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<IdentityResolveHandleResponse> resolveHandle(
            IdentityResolveHandleRequest request
    ) {
        return proceed(IdentityResolveHandleResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(ATProtocolTypes.IdentifyResolveHandle)
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public void updateHandle() {

    }
}
