package bsky4j;

import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.bsky.NotificationResource;

public interface Bluesky extends ATProtocol {

    FeedResource feed();

    GraphResource graph();

    NotificationResource notification();
}
