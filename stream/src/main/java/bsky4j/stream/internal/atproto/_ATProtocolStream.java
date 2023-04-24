package bsky4j.stream.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.internal.atproto._ATProtocol;
import bsky4j.stream.ATProtocolStream;
import bsky4j.stream.api.atproto.SyncResource;

public class _ATProtocolStream implements ATProtocolStream {


    private final ATProtocol atproto;

    protected final SyncResource sync;

    public _ATProtocolStream(String uri) {
        this.atproto = new _ATProtocol(uri);
        this.sync = new _SyncResource(this.atproto, uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncResource sync() {
        return sync;
    }

}
