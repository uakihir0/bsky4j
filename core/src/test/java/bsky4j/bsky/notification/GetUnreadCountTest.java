package bsky4j.bsky.notification;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountRequest;
import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class GetUnreadCountTest extends AbstractTest {

    @Test
    public void testGetUnreadCount() {

        Response<NotificationGetUnreadCountResponse> response =
                BlueskyFactory.getInstance(Service.BSKY_SOCIAL.getUri())
                        .notification()
                        .getUnreadCount(NotificationGetUnreadCountRequest
                                .builder()
                                .accessJwt(accessJwt)
                                .build());

        System.out.println(response.get().getCount());
    }
}
