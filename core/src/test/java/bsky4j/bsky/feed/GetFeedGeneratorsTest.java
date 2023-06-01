package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetFeedGeneratorsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetFeedGeneratorsTest extends AbstractTest {


    @Test
    public void testGetFeedGenerators() {
        List<String> uris = new ArrayList<>();
        uris.add("at://did:plc:z72i7hdynmk6r22z27h6tvur/app.bsky.feed.generator/with-friends");

        Response<FeedGetFeedGeneratorsResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getFeedGenerators(
                        FeedGetFeedGeneratorsRequest.builder()
                                .accessJwt(accessJwt)
                                .feeds(uris)
                                .build()
                );

        feeds.get().getFeeds().forEach(i -> {
            System.out.println(i.getDisplayName());
        });
    }
}
