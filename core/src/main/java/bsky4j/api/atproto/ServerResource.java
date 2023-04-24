package bsky4j.api.atproto;

import bsky4j.api.entity.atproto.server.ServerCreateSessionRequest;
import bsky4j.api.entity.atproto.server.ServerCreateSessionResponse;
import bsky4j.api.entity.atproto.server.ServerGetSessionResponse;
import bsky4j.api.entity.atproto.server.ServerRefreshSessionResponse;
import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.Response;

/**
 * ATProtocol/Server
 * <a href="https://atproto.com/lexicons/com-atproto-server">Reference</a>
 */
public interface ServerResource {

    /**
     * Create an account.
     */
    void createAccount();

    /**
     * Create an invite code.
     */
    void createInviteCode();

    /**
     * Create an authentication session.
     */
    Response<ServerCreateSessionResponse> createSession(ServerCreateSessionRequest request);

    /**
     * Delete a user account with a token and password.
     */
    void deleteAccount();

    /**
     * Delete the current session.
     */
    Response<Void> deleteSession(AuthRequest request);

    /**
     * Get a document describing the service's accounts configuration.
     */
    void describeServer();

    /**
     * Get information about the current session.
     */
    Response<ServerGetSessionResponse> getSession(AuthRequest request);

    /**
     * Refresh an authentication session.
     */
    Response<ServerRefreshSessionResponse> refreshSession(AuthRequest request);

    /**
     * Initiate a user account deletion via email.
     */
    void requestAccountDelete();

    /**
     * Initiate a user account password reset via email.
     */
    void requestPasswordReset();

    /**
     * Reset a user account password using a token.
     */
    void resetPassword();

}
