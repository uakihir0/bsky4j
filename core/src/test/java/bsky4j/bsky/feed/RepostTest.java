package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedDeleteRepostRequest;
import bsky4j.api.entity.bsky.feed.FeedRepostRequest;
import bsky4j.api.entity.bsky.feed.FeedRepostResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import bsky4j.model.atproto.repo.RepoStrongRef;
import org.junit.Test;

public class RepostTest extends AbstractTest {

    @Test
    public void testRepost() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jsmlerb7m22b";
        String cid = "bafyreied4repnphzjbz5lu5syibtnp72omdecpyde2yykpfjppgp32zopu";

        RepoStrongRef ref = new RepoStrongRef(uri, cid);
        Response<FeedRepostResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().repost(
                        FeedRepostRequest.builder()
                                .accessJwt(accessJwt)
                                .subject(ref)
                                .build()
                );

        System.out.println(response.get().getUri());
    }

    @Test
    public void testDeleteRepost() {
        String repostUri;

        { // Create
            String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jsmlerb7m22b";
            String cid = "bafyreied4repnphzjbz5lu5syibtnp72omdecpyde2yykpfjppgp32zopu";

            RepoStrongRef ref = new RepoStrongRef(uri, cid);
            Response<FeedRepostResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().repost(
                            FeedRepostRequest.builder()
                                    .accessJwt(accessJwt)
                                    .subject(ref)
                                    .build()
                    );

            repostUri = response.get().getUri();
        }

        { // Delete
            BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().deleteRepost(
                            FeedDeleteRepostRequest.builder()
                                    .accessJwt(accessJwt)
                                    .uri(repostUri)
                                    .build()
                    );
        }
    }
}
