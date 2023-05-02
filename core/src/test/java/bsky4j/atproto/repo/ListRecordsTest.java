package bsky4j.atproto.repo;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.BlueskyTypes;
import bsky4j.api.entity.atproto.repo.RepoListRecordsRequest;
import bsky4j.api.entity.atproto.repo.RepoListRecordsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class ListRecordsTest extends AbstractTest {

    @Test
    public void testListRecords() {

        Response<RepoListRecordsResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().listRecords(
                        RepoListRecordsRequest.builder()
                                .collection(BlueskyTypes.FeedPost)
                                .repo(handle)
                                .reverse(true)
                                .limit(1)
                                .build()
                );

        response.get().getRecords().forEach(record -> {
            print(record.getValue());
        });
    }

    @Test
    public void testListRecordBlocks() {

        Response<RepoListRecordsResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().listRecords(
                        RepoListRecordsRequest.builder()
                                .collection(BlueskyTypes.GraphBlock)
                                .repo(handle)
                                .build()
                );

        response.get().getRecords().forEach(record -> {
            print(record.getValue());
        });
    }

    @Test
    public void testListRecordLikes() {

        Response<RepoListRecordsResponse> response = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().listRecords(
                        RepoListRecordsRequest.builder()
                                .collection(BlueskyTypes.FeedLike)
                                .repo(handle)
                                .build()
                );

        response.get().getRecords().forEach(record -> {
            print(record.getValue());
        });
    }
}
