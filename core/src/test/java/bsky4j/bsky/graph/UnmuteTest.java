package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphUnmuteActorRequest;
import bsky4j.domain.Service;
import org.junit.Test;

public class UnmuteTest extends AbstractTest {

    @Test
    public void testUnmute() {

        BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().unmuteActor(
                        GraphUnmuteActorRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("bsky.app")
                                .build()
                );
    }
}
