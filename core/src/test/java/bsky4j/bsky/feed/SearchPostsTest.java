package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedSearchPostsRequest;
import bsky4j.api.entity.bsky.feed.FeedSearchPostsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class SearchPostsTest extends AbstractTest {

    @Test
    public void testGetActorFeeds() {

        Response<FeedSearchPostsResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().searchPosts(
                        FeedSearchPostsRequest.builder()
                                .accessJwt(accessJwt)
                                .q("bsky4j")
                                .build()
                );

        feeds.get().getPosts().forEach(this::print);
    }
}