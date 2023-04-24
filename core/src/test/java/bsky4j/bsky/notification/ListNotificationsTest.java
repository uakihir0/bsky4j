package bsky4j.bsky.notification;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsRequest;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

public class ListNotificationsTest extends AbstractTest {

    @Test
    public void testListNotifications() {

        Response<NotificationListNotificationsResponse> response =
                BlueskyFactory.getInstance(Service.BSKY_SOCIAL.getUri())
                        .notification()
                        .listNotifications(NotificationListNotificationsRequest
                                .builder()
                                .accessJwt(accessJwt)
                                .build());

        response.get().getNotifications().forEach(it -> {
            System.out.println("|NOTIFICATION|-----------------------------------------");
            System.out.println("REASON> " + it.getReason());
            print(it.getRecord());
        });
    }
}
