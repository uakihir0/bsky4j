package bsky4j.bsky.graph;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.graph.GraphDeleteFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class FollowTest extends AbstractTest {

    @Test
    public void testFollow() {
        String did = "did:plc:bwdof2anluuf5wmfy2upgulw";
        String uri;

        { // Follow
            Response<GraphFollowResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .graph().follow(
                            GraphFollowRequest.builder()
                                    .accessJwt(accessJwt)
                                    .subject(did)
                                    .build()
                    );

            uri = response.get().getUri();
        }

        { // DeleteFollow
            BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .graph().deleteFollow(
                            GraphDeleteFollowRequest.builder()
                                    .accessJwt(accessJwt)
                                    .uri(uri)
                                    .build()
                    );
        }
    }
}
