package bsky4j.internal.bsky;

import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.NotificationResource;
import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountRequest;
import bsky4j.api.entity.bsky.notification.NotificationGetUnreadCountResponse;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsRequest;
import bsky4j.api.entity.bsky.notification.NotificationListNotificationsResponse;
import bsky4j.api.entity.bsky.notification.NotificationUpdateSeenRequest;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _NotificationResource implements NotificationResource {

    private final String uri;

    public _NotificationResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<NotificationGetUnreadCountResponse> getUnreadCount(
            NotificationGetUnreadCountRequest request
    ) {
        return proceed(NotificationGetUnreadCountResponse.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(BlueskyTypes.NotificationGetUnreadCount)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .get();
        });
    }

    @Override
    public Response<NotificationListNotificationsResponse> listNotifications(
            NotificationListNotificationsRequest request
    ) {
        return proceed(NotificationListNotificationsResponse.class, () -> {
            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyTypes.NotificationListNotifications)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<Void> updateSeen(
            NotificationUpdateSeenRequest request
    ) {
        return proceed(() -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(BlueskyTypes.NotificationUpdateSeen)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }
}
