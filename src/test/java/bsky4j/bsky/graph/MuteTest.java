package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphMuteActorRequest;
import bsky4j.domain.Service;
import org.junit.Test;

public class MuteTest extends AbstractTest {

    @Test
    public void testMute() {

        BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().muteActor(
                        GraphMuteActorRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("bsky.app")
                                .build()
                );
    }
}
