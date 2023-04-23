package bsky4j.stream.internal.atproto;

import bsky4j.stream.ATProtocolStream;
import bsky4j.stream.api.atproto.SyncResource;

public class _ATProtocolStream implements ATProtocolStream {

    protected final SyncResource sync;


    public _ATProtocolStream(String uri) {
        this.sync = new _SyncResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncResource sync() {
        return sync;
    }

}
