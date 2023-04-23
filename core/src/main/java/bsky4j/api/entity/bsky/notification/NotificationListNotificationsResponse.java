package bsky4j.api.entity.bsky.notification;

import bsky4j.model.bsky.notification.NotificationListNotificationsNotification;

import java.util.List;

public class NotificationListNotificationsResponse {

    private String cursor;
    private List<NotificationListNotificationsNotification> notifications;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<NotificationListNotificationsNotification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationListNotificationsNotification> notifications) {
        this.notifications = notifications;
    }
    // endregion
}
