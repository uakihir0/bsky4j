package bsky4j.api.entity.bsky.notification;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class NotificationUpdateSeenRequest extends AuthRequest implements MapRequest {

    protected NotificationUpdateSeenRequest(String accessJwt) {
        super(accessJwt);
    }

    private String seenAt;

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        addParam(map, "seenAt", getSeenAt());
        return map;
    }

    // region
    public static NotificationUpdateSeenRequestBuilder builder() {
        return new NotificationUpdateSeenRequestBuilder();
    }

    public String getSeenAt() {
        if (seenAt == null) {
            return _InternalUtility.dateFormat.format(new Date());
        }
        return seenAt;
    }

    public static final class NotificationUpdateSeenRequestBuilder {
        private String seenAt;
        private String accessJwt;

        private NotificationUpdateSeenRequestBuilder() {
        }

        public NotificationUpdateSeenRequestBuilder seenAt(String seenAt) {
            this.seenAt = seenAt;
            return this;
        }

        public NotificationUpdateSeenRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public NotificationUpdateSeenRequest build() {
            NotificationUpdateSeenRequest notificationUpdateSeenRequest = new NotificationUpdateSeenRequest(accessJwt);
            notificationUpdateSeenRequest.seenAt = this.seenAt;
            return notificationUpdateSeenRequest;
        }
    }
    // endregion
}
