package bsky4j;

import bsky4j.api.bsky.FeedResource;
import bsky4j.api.bsky.GraphResource;

public interface Bluesky extends ATProtocol {

    FeedResource feed();

    GraphResource graph();
}
