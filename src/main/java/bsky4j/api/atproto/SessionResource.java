package bsky4j.api.atproto;

import bsky4j.api.share.AuthRequest;
import bsky4j.entity.atproto.session.SessionCreateRequest;
import bsky4j.entity.atproto.session.SessionCreateResponse;
import bsky4j.entity.atproto.session.SessionGetResponse;
import bsky4j.entity.share.Response;

/**
 * ATProtocol/Session
 * https://atproto.com/lexicons/com-atproto-session
 */
public interface SessionResource {

    /**
     * Create an authentication session.
     */
    Response<SessionCreateResponse> create(SessionCreateRequest request);

    /**
     * Delete the current session.
     */
    Response<Void> delete(AuthRequest request);

    /**
     * Get information about the current session.
     */
    Response<SessionGetResponse> get(AuthRequest request);
}
