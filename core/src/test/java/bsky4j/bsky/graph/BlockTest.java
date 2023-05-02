package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphBlockRequest;
import bsky4j.api.entity.bsky.graph.GraphBlockResponse;
import bsky4j.api.entity.bsky.graph.GraphDeleteBlockRequest;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class BlockTest extends AbstractTest {

    @Test
    public void testBlock() {
        String did = "did:plc:oc6vwdlmk2kqyida5i74d3p5";
        String uri;

        { // Block
            Response<GraphBlockResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .graph().block(
                            GraphBlockRequest.builder()
                                    .accessJwt(accessJwt)
                                    .subject(did)
                                    .build()
                    );

            uri = response.get().getUri();
        }

//        { // DeleteBlock
//            BlueskyFactory
//                    .getInstance(Service.BSKY_SOCIAL.getUri())
//                    .graph().deleteBlock(
//                            GraphDeleteBlockRequest.builder()
//                                    .accessJwt(accessJwt)
//                                    .uri(uri)
//                                    .build()
//                    );
//        }
    }
}
