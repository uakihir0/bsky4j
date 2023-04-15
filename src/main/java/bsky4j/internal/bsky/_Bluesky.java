package bsky4j.internal.bsky;

import bsky4j.Bluesky;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;
import bsky4j.internal.atproto._ATProtocol;

public class _Bluesky extends _ATProtocol implements Bluesky {

    protected final FeedResource feed;

    protected final GraphResource graph;

    public _Bluesky(String uri) {
        super(uri);

        this.feed = new _FeedResource(uri);
        this.graph = new _GraphResource(uri);
    }

    @Override
    public FeedResource feed() {
        return feed;
    }

    @Override
    public GraphResource graph() {
        return graph;
    }
}
