package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphGetMutesRequest;
import bsky4j.api.entity.bsky.graph.GraphGetMutesResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetMutesTest extends AbstractTest {

    @Test
    public void testGetMutes() {

        Response<GraphGetMutesResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().getMutes(
                        GraphGetMutesRequest.builder()
                                .accessJwt(accessJwt)
                                .build()
                );

        response.get().getMutes()
                .forEach(this::print);
    }
}
