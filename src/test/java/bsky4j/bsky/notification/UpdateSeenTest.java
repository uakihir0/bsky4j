package bsky4j.bsky.notification;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.notification.NotificationUpdateSeenRequest;
import bsky4j.domain.Service;
import org.junit.Test;

public class UpdateSeenTest extends AbstractTest {

    @Test
    public void testUpdateSeen() {

        BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .notification().updateSeen(
                        NotificationUpdateSeenRequest
                                .builder()
                                .accessJwt(accessJwt)
                                .build());
    }
}
