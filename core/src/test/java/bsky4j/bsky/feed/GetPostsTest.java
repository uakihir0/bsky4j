package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetLikesRequest;
import bsky4j.api.entity.bsky.feed.FeedGetLikesResponse;
import bsky4j.api.entity.bsky.feed.FeedGetPostsRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetPostsTest extends AbstractTest {

    @Test
    public void testGetPosts() {
        List<String> uris = new ArrayList<>();
        uris.add("at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jt5ao4gpxc2u");
        uris.add("at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jvetipo2rd2r");

        Response<FeedGetPostsResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getPosts(
                        FeedGetPostsRequest.builder()
                                .accessJwt(accessJwt)
                                .uris(uris)
                                .build()
                );

        feeds.get().getPosts().forEach(this::print);
    }
}
