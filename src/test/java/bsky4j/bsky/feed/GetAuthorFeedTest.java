package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetAuthorFeedTest extends AbstractTest {

    @Test
    public void testGetAuthorFeed() {

        Response<FeedGetAuthorFeedResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getAuthorFeed(
                        FeedGetAuthorFeedRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("uakihir0.bsky.social")
                                .build()
                );

        feeds.get().getFeed().forEach(f -> {
            print(f.getPost());
        });
    }
}
