package bsky4j.internal.bsky;

import bsky4j.Bluesky;
import bsky4j.api.atproto.SessionResource;
import bsky4j.api.bsky.FeedResource;
import bsky4j.internal.atproto._ATProtocol;
import bsky4j.internal.atproto._SessionResource;

public class _Bluesky extends _ATProtocol implements Bluesky {

    protected final FeedResource feed;

    public _Bluesky(String uri) {
        super(uri);

        this.feed = new _FeedResource(uri);
    }

    @Override
    public FeedResource feed() {
        return feed;
    }
}
