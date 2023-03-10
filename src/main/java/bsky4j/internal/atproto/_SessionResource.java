package bsky4j.internal.atproto;

import bsky4j.ATProtocolActions;
import bsky4j.api.atproto.SessionResource;
import bsky4j.api.share.AuthRequest;
import bsky4j.entity.atproto.session.SessionCreateRequest;
import bsky4j.entity.atproto.session.SessionCreateResponse;
import bsky4j.entity.atproto.session.SessionGetResponse;
import bsky4j.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _SessionResource implements SessionResource {

    private final String uri;

    _SessionResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<SessionCreateResponse> create(SessionCreateRequest request) {
        return proceed(SessionCreateResponse.class, () -> {

            System.out.println(request.toJson());

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolActions.SessionCreate)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public Response<Void> delete(AuthRequest request) {
        return proceed(() -> {

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolActions.SessionDelete)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", request.getBearerToken())
                    .post();
        });
    }

    @Override
    public Response<SessionGetResponse> get(AuthRequest request) {
        return proceed(SessionGetResponse.class, () -> {

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolActions.SessionGet)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", request.getBearerToken())
                    .get();
        });
    }
}

