package bsky4j.stream;

import bsky4j.stream.api.atproto.SyncResource;

public interface ATProtocolStream {

    SyncResource sync();
}
