package bsky4j.atproto.session;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.atproto.server.ServerCreateSessionRequest;
import bsky4j.api.entity.atproto.server.ServerCreateSessionResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class CreateSessionTest extends AbstractTest {

    @Test
    public void testCreateSession() {

        Response<ServerCreateSessionResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .server().createSession(
                        ServerCreateSessionRequest.builder()
                                .handle(handle)
                                .password(password)
                                .build()
                );

        System.out.println(response.get().getAccessJwt());
        System.out.println(response.get().getRefreshJwt());
        System.out.println(response.get().getHandle());
        System.out.println(response.get().getDid());

        // Save the accessJwt for testing other APIs
        accessJwt = response.get().getAccessJwt();
        saveAccessJwt();
    }
}
