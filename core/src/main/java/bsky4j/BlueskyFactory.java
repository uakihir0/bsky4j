package bsky4j;

import bsky4j.internal._Bluesky;

public class BlueskyFactory {

    public static Bluesky getInstance(String uri) {
        return new _Bluesky(uri);
    }
}

