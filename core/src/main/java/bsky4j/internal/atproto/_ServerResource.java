package bsky4j.internal.atproto;

import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.ServerResource;
import bsky4j.api.entity.atproto.server.ServerCreateSessionRequest;
import bsky4j.api.entity.atproto.server.ServerCreateSessionResponse;
import bsky4j.api.entity.atproto.server.ServerGetSessionResponse;
import bsky4j.api.entity.atproto.server.ServerRefreshSessionResponse;
import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;
import static bsky4j.internal.share._InternalUtility.xrpc;

public class _ServerResource implements ServerResource {

    private final String uri;

    public _ServerResource(String uri) {
        this.uri = uri;
    }

    @Override
    public void createAccount() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public void createInviteCode() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public Response<ServerCreateSessionResponse> createSession(ServerCreateSessionRequest request) {
        return proceed(ServerCreateSessionResponse.class, () -> {

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.ServerCreateSession)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public void deleteAccount() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public Response<Void> deleteSession(AuthRequest request) {
        return proceed(() -> {

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.ServerDeleteSession)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", request.getBearerToken())
                    .post();
        });
    }

    @Override
    public void describeServer() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public Response<ServerGetSessionResponse> getSession(AuthRequest request) {
        return proceed(ServerGetSessionResponse.class, () -> {

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.ServerGetSession)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", request.getBearerToken())
                    .get();
        });
    }

    @Override
    public Response<ServerRefreshSessionResponse> refreshSession(AuthRequest request) {
        return proceed(ServerRefreshSessionResponse.class, () -> {

            return new HttpRequestBuilder()
                    .target(xrpc(this.uri))
                    .path(ATProtocolTypes.ServerRefreshSession)
                    .request(HttpMediaType.APPLICATION_JSON)
                    .header("Authorization", request.getBearerToken())
                    .get();
        });
    }

    @Override
    public void requestAccountDelete() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public void requestPasswordReset() {
        throw new IllegalStateException("not implemented.");
    }

    @Override
    public void resetPassword() {
        throw new IllegalStateException("not implemented.");
    }
}

