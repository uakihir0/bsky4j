package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetLikesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetLikesResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetLikesTest extends AbstractTest {

    @Test
    public void testLikes() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jt5ao4gpxc2u";

        Response<FeedGetLikesResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getLikes(
                        FeedGetLikesRequest.builder()
                                .accessJwt(accessJwt)
                                .uri(uri)
                                .build()
                );

        feeds.get().getLikes().forEach(f -> {
            print(f.getActor());
        });
    }
}
