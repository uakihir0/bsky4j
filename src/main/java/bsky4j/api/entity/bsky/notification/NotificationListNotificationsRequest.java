package bsky4j.api.entity.bsky.notification;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class NotificationListNotificationsRequest extends AuthRequest implements MapRequest {

    protected NotificationListNotificationsRequest(String accessJwt) {
        super(accessJwt);
    }

    private Integer limit;
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static NotificationListNotificationsRequestBuilder builder() {
        return new NotificationListNotificationsRequestBuilder();
    }

    public Integer getLimit() {
        return limit;
    }

    public String getCursor() {
        return cursor;
    }


    public static final class NotificationListNotificationsRequestBuilder {
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private NotificationListNotificationsRequestBuilder() {
        }

        public NotificationListNotificationsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public NotificationListNotificationsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public NotificationListNotificationsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public NotificationListNotificationsRequest build() {
            NotificationListNotificationsRequest notificationListNotificationsRequest = new NotificationListNotificationsRequest(accessJwt);
            notificationListNotificationsRequest.limit = this.limit;
            notificationListNotificationsRequest.cursor = this.cursor;
            return notificationListNotificationsRequest;
        }
    }
    // endregion
}
