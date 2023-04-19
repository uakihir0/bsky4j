package bsky4j.api.entity.bsky.notification;

import bsky4j.api.entity.share.AuthRequest;

public class NotificationGetUnreadCountRequest extends AuthRequest {

    protected NotificationGetUnreadCountRequest(String accessJwt) {
        super(accessJwt);
    }


    // region
    public static NotificationGetUnreadCountRequestBuilder builder() {
        return new NotificationGetUnreadCountRequestBuilder();
    }

    public static final class NotificationGetUnreadCountRequestBuilder {
        private String accessJwt;

        private NotificationGetUnreadCountRequestBuilder() {
        }


        public NotificationGetUnreadCountRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public NotificationGetUnreadCountRequest build() {
            NotificationGetUnreadCountRequest notificationGetUnreadCountRequest = new NotificationGetUnreadCountRequest(accessJwt);
            return notificationGetUnreadCountRequest;
        }
    }
    // endregion
}
