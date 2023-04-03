package bsky4j.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;

public class _ATProtocol implements ATProtocol {

    protected final ServerResource session;
    protected final RepoResource repo;

    public _ATProtocol(String uri) {
        this.session = new _ServerResource(uri);
        this.repo = new _RepoResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerResource session() {
        return session;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RepoResource repo() {
        return repo;
    }
}
