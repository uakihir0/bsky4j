package bsky4j.bsky.undoc;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsRequest;
import bsky4j.api.entity.bsky.undoc.UndocSearchFeedsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

import java.util.List;

public class SearchFeedsTest extends AbstractTest {

    @Test
    public void testSearchFeeds() {

        Response<List<UndocSearchFeedsResponse>> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .undoc().searchFeeds(
                        UndocSearchFeedsRequest.builder()
                                .q("SocialHub")
                                .build()
                );

        feeds.get().forEach(f -> {
            System.out.println(f.getPost().getText());
        });
    }
}
