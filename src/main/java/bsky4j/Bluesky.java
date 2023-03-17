package bsky4j;

import bsky4j.api.bsky.FeedResource;

public interface Bluesky extends ATProtocol {

    FeedResource feed();
}
