package bsky4j.internal.bsky;

import bsky4j.Bluesky;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.bsky.NotificationResource;
import bsky4j.internal.atproto._ATProtocol;

public class _Bluesky extends _ATProtocol implements Bluesky {

    protected final FeedResource feed;

    protected final GraphResource graph;

    protected final NotificationResource notification;


    public _Bluesky(String uri) {
        super(uri);

        this.feed = new _FeedResource(uri);
        this.graph = new _GraphResource(uri);
        this.notification = new _NotificationResource(uri);
    }

    @Override
    public FeedResource feed() {
        return feed;
    }

    @Override
    public GraphResource graph() {
        return graph;
    }

    @Override
    public NotificationResource notification() {
        return notification;
    }
}
