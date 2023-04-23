package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetFollowersTest extends AbstractTest {

    @Test
    public void testGetFollowers() {

        Response<GraphGetFollowersResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().getFollowers(
                        GraphGetFollowersRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("uakihir0.bsky.social")
                                .build()
                );

        response.get().getFollowers()
                .forEach(this::print);
    }
}
