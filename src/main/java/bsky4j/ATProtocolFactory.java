package bsky4j;

import bsky4j.internal.atproto._ATProtocol;

public class ATProtocolFactory {

    public ATProtocol getInstance(String uri) {
        return new _ATProtocol(uri);
    }
}
