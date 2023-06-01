package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetActorFeedsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetActorFeedsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetActorFeedsTest extends AbstractTest {

    @Test
    public void testGetActorFeeds() {

        Response<FeedGetActorFeedsResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getActorFeeds(
                        FeedGetActorFeedsRequest.builder()
                                .accessJwt(accessJwt)
                                .actor("uakihir0.com")
                                .build()
                );

        feeds.get().getFeeds().forEach(i -> {
            System.out.println(i.getDisplayName());
        });
    }
}
