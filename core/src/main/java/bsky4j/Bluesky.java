package bsky4j;

import bsky4j.api.bsky.ActorResource;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;
import bsky4j.api.bsky.NotificationResource;
import bsky4j.api.bsky.UndocumentedResource;

public interface Bluesky extends ATProtocol {

    ActorResource actor();

    FeedResource feed();

    GraphResource graph();

    NotificationResource notification();

    UndocumentedResource undoc();
}
