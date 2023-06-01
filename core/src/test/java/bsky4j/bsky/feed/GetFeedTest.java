package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetFeedResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetFeedTest extends AbstractTest {

    @Test
    public void testGetFeed() {
        String uri = "at://did:plc:z72i7hdynmk6r22z27h6tvur/app.bsky.feed.generator/with-friends";

        Response<FeedGetFeedResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getFeed(
                        FeedGetFeedRequest.builder()
                                .accessJwt(accessJwt)
                                .feed(uri)
                                .build()
                );

        feeds.get().getFeed().forEach(f -> {
            print(f.getPost());
        });
    }
}
