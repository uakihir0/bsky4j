package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadRequest;
import bsky4j.api.entity.bsky.feed.FeedGetPostThreadResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import bsky4j.model.bsky.feed.FeedDefsThreadUnion;
import bsky4j.model.bsky.feed.FeedDefsThreadViewPost;
import org.junit.Test;

public class GetPostThreadTest extends AbstractTest {

    @Test
    public void testGetThreadPost() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jr4mubjdj322";

        Response<FeedGetPostThreadResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().getPostThread(
                        FeedGetPostThreadRequest.builder()
                                .accessJwt(accessJwt)
                                .uri(uri)
                                .build()
                );


        FeedDefsThreadUnion union = feeds.get().getThread();
        if (union instanceof FeedDefsThreadViewPost) {
            FeedDefsThreadViewPost post = (FeedDefsThreadViewPost) union;

            while (true) {
                print(post.getPost());
                if (post.replies == null || post.replies.isEmpty()) {
                    break;
                }
                post = (FeedDefsThreadViewPost) post.replies.get(0);
            }
        }
    }
}
