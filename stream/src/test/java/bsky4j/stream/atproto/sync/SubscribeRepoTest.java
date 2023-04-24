package bsky4j.stream.atproto.sync;

import bsky4j.domain.Service;
import bsky4j.stream.ATProtocolStreamFactory;
import bsky4j.stream.AbstractTest;
import bsky4j.stream.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.stream.util.StreamClient;
import net.socialhub.logger.Logger;
import org.junit.Test;

public class SubscribeRepoTest extends AbstractTest {

    @Test
    public void testSubscribeRepo() {
        Logger.getLogger(null).setLogLevel(Logger.LogLevel.WARN);

        try {
            StreamClient stream = ATProtocolStreamFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .sync().subscribeRepos(
                            SyncSubscribeReposRequest
                                    .builder()
                                    .build()
                    );

            stream.setEventCallback((cid, url, record) -> {
                print(url, record);
            });

            stream.connect();
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
