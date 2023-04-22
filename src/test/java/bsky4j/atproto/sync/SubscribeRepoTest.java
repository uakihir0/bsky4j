package bsky4j.atproto.sync;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.domain.Service;
import bsky4j.util.ws.StreamClient;
import org.junit.Test;

public class SubscribeRepoTest extends AbstractTest {

    @Test
    public void testSubscribeRepo() {

        try {
            StreamClient stream = BlueskyFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .sync().subscribeRepos(
                            SyncSubscribeReposRequest
                                    .builder()
                                    .build()
                    );

            stream.connect();
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
