package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksRequest;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetBlocksTest extends AbstractTest {

    @Test
    public void testGetBlocks() {

        Response<GraphGetBlocksResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .graph().getBlocks(
                        GraphGetBlocksRequest.builder()
                                .accessJwt(accessJwt)
                                .build()
                );

        response.get().getBlocks()
                .forEach(this::print);
    }
}
