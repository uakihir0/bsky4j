package bsky4j.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.SessionResource;

public class _ATProtocol implements ATProtocol {

    protected final SessionResource session;

    public _ATProtocol(String uri) {
        this.session = new _SessionResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionResource session() {
        return session;
    }
}
