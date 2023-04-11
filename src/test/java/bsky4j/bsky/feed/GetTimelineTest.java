package bsky4j.bsky.feed;

import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineRequest;
import bsky4j.api.entity.bsky.feed.FeedGetTimelineResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.AbstractTest;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetTimelineTest extends AbstractTest {

    @Test
    public void testGetTimeline() {

        Response<FeedGetTimelineResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getTimeline(
                        FeedGetTimelineRequest.builder()
                                .accessJwt(accessJwt)
                                .limit(1)
                                .build()
                );

        response.get().getFeed().forEach(f -> {
            print(f.getPost());
        });


        Response<FeedGetTimelineResponse> response2 = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getTimeline(
                        FeedGetTimelineRequest.builder()
                                .accessJwt(accessJwt)
                                .cursor(response.get().getCursor())
                                .limit(10)
                                .build()
                );

        response2.get().getFeed().forEach(f -> {
            print(f.getPost());
        });
    }
}
