package bsky4j.bsky.undoc;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.undoc.UndocGetPopularRequest;
import bsky4j.api.entity.bsky.undoc.UndocGetPopularResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetPopularTest extends AbstractTest {

    @Test
    public void testGetPopular() {

        Response<UndocGetPopularResponse> feeds = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .undoc().getPopular(
                        UndocGetPopularRequest.builder()
                                .accessJwt(accessJwt)
                                .build()
                );

        feeds.get().getFeed().forEach(f -> {
            print(f.getPost());
        });
    }
}
