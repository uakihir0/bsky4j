package bsky4j.atproto.repo;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.BlueskyTypes;
import bsky4j.api.entity.atproto.repo.RepoGetRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoGetRecordResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetRecordTest extends AbstractTest {

    @Test
    public void testGetRecord() {
        String uri = "at://did:plc:bwdof2anluuf5wmfy2upgulw/app.bsky.feed.post/3jqcyfp3zt22s";

        Response<RepoGetRecordResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().getRecord(
                        RepoGetRecordRequest.builder()
                                .collection(BlueskyTypes.FeedPost)
                                .repo(handle)
                                .uri(uri)
                                .build()
                );

        System.out.println(response.get().getValue().getType());
    }
}
