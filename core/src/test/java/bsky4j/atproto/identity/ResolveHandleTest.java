package bsky4j.atproto.identity;

import bsky4j.BlueskyFactory;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleRequest;
import bsky4j.api.entity.atproto.identity.IdentityResolveHandleResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class ResolveHandleTest {

    @Test
    public void testResolveHandle() {

        Response<IdentityResolveHandleResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .identity().resolveHandle(
                        IdentityResolveHandleRequest.builder()
                                .handle("uakihir0.com")
                                .build()
                );

        System.out.println(response.get().getDid());
    }
}
