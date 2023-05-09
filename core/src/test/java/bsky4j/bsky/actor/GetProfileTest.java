package bsky4j.bsky.actor;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.actor.ActorGetProfileRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfileResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetProfileTest extends AbstractTest {

    @Test
    public void testGetProfile() {
        Response<ActorGetProfileResponse> actor = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .actor().getProfile(
                        ActorGetProfileRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("uakihir0.com")
                                .build()
                );

        print(actor.get());
    }
}
