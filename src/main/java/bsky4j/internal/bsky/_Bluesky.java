package bsky4j.internal.bsky;

import bsky4j.Bluesky;
import bsky4j.internal.atproto._ATProtocol;

public class _Bluesky extends _ATProtocol implements Bluesky {

    public _Bluesky(String uri){
        super(uri);
    }
}
