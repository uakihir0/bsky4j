package bsky4j.bsky.feed;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.feed.FeedDeleteLikeRequest;
import bsky4j.api.entity.bsky.feed.FeedLikeRequest;
import bsky4j.api.entity.bsky.feed.FeedLikeResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import bsky4j.model.atproto.repo.RepoStrongRef;
import org.junit.Test;

public class LikeTest extends AbstractTest {

    @Test
    public void testLike() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jsmlerb7m22b";
        String cid = "bafyreied4repnphzjbz5lu5syibtnp72omdecpyde2yykpfjppgp32zopu";

        RepoStrongRef ref = new RepoStrongRef(uri, cid);
        Response<FeedLikeResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .feed().like(
                        FeedLikeRequest.builder()
                                .accessJwt(accessJwt)
                                .subject(ref)
                                .build()
                );

        System.out.println(response.get().getUri());
    }

    @Test
    public void deleteLike() {
        String likeUri;

        { // DO Like
            String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jsmlerb7m22b";
            String cid = "bafyreied4repnphzjbz5lu5syibtnp72omdecpyde2yykpfjppgp32zopu";

            RepoStrongRef ref = new RepoStrongRef(uri, cid);
            Response<FeedLikeResponse> response = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().like(
                            FeedLikeRequest.builder()
                                    .accessJwt(accessJwt)
                                    .subject(ref)
                                    .build()
                    );

            System.out.println(response.get().getUri());
            likeUri = response.get().getUri();
        }


        { // UNDO Like
            BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .feed().deleteLike(
                            FeedDeleteLikeRequest.builder()
                                    .accessJwt(accessJwt)
                                    .uri(likeUri)
                                    .build()
                    );
        }
    }
}
