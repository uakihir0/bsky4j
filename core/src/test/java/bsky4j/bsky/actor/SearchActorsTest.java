package bsky4j.bsky.actor;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsRequest;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class SearchActorsTest extends AbstractTest {

    @Test
    public void testSearchActors() {

        Response<ActorSearchActorsResponse> actors = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .actor().searchActors(
                        ActorSearchActorsRequest.builder()
                                .accessJwt(accessJwt)
                                .term("uakihir0")
                                .build()
                );

        actors.get().getActors().forEach(this::print);
    }
}
