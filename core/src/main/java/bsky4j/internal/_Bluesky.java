package bsky4j.internal;

import bsky4j.Bluesky;
import bsky4j.api.bsky.ActorResource;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.bsky.NotificationResource;
import bsky4j.api.bsky.UndocumentedResource;
import bsky4j.internal.bsky._ActorResource;
import bsky4j.internal.bsky._FeedResource;
import bsky4j.internal.bsky._GraphResource;
import bsky4j.internal.bsky._NotificationResource;
import bsky4j.internal.bsky._UndocumentedResource;

public class _Bluesky extends _ATProtocol implements Bluesky {

    protected final ActorResource actor;

    protected final FeedResource feed;

    protected final GraphResource graph;

    protected final NotificationResource notification;

    protected final UndocumentedResource undoc;

    public _Bluesky(String uri) {
        super(uri);

        this.actor = new _ActorResource(uri);
        this.feed = new _FeedResource(uri);
        this.graph = new _GraphResource(uri);
        this.notification = new _NotificationResource(uri);
        this.undoc = new _UndocumentedResource(uri);
    }

    @Override
    public ActorResource actor() {
        return actor;
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

    @Override
    public UndocumentedResource undoc() {
        return undoc;
    }
}
