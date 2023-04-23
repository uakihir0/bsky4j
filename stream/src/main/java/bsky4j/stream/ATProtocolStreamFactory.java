package bsky4j.stream;

import bsky4j.stream.internal.atproto._ATProtocolStream;

public class ATProtocolStreamFactory {

    public static ATProtocolStream getInstance(String uri) {
        return new _ATProtocolStream(uri);
    }
}
