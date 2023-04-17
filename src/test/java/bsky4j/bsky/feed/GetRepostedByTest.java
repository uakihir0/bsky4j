package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByRequest;
import bsky4j.api.entity.bsky.feed.FeedGetRepostedByResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetRepostedByTest extends AbstractTest {

    @Test
    public void testGetRepostedBy() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jr7b5svzuc2q";

        Response<FeedGetRepostedByResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getRepostedBy(
                        FeedGetRepostedByRequest.builder()
                                .accessJwt(accessJwt)
                                .uri(uri)
                                .build()
                );

        response.get().getRepostedBy().forEach(r -> {
            System.out.println("------------------------------");
            System.out.println(r.getDisplayName());
            System.out.println(r.getHandle());
            System.out.println(r.getAvatar());
        });
    }
}
