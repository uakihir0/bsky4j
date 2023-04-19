package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountRequest;
import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountResponse;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsRequest;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsResponse;
import bsky4j.api.entity.bsky.notification.NotificationUpdateSeenRequest;
import bsky4j.api.entity.share.Response;

/**
 * Bluesky/Notification
 * <a href="https://atproto.com/lexicons/app-bsky-notification">Reference</a>
 */
public interface NotificationResource {

    /**
     * Get the number of unread notifications.
     */
    Response<NotificationGetUnreadCountResponse> getUnreadCount(NotificationGetUnreadCountRequest request);

    /**
     * List notifications.
     */
    Response<NotificationListNotificationsResponse> listNotifications(NotificationListNotificationsRequest request);


    /**
     * Notify server that the user has seen notifications.
     */
    Response<Void> updateSeen(NotificationUpdateSeenRequest request);
}
