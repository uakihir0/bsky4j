package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetFollowsTest extends AbstractTest {

    @Test
    public void testGetFollows() {

        Response<GraphGetFollowsResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().getFollows(
                        GraphGetFollowsRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("uakihir0.bsky.social")
                                .build()
                );

        response.get().getFollows()
                .forEach(this::print);
    }
}
