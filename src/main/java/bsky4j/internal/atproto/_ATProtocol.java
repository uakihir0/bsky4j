package bsky4j.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.BlobResource;
import bsky4j.api.atproto.SessionResource;

public class _ATProtocol implements ATProtocol {

    protected final SessionResource session;
    protected final BlobResource blob;

    public _ATProtocol(String uri) {
        this.session = new _SessionResource(uri);
        this.blob = new _BlobResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionResource session() {
        return session;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobResource blob() {
        return blob;
    }
}
