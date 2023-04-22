package bsky4j.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;
import bsky4j.api.atproto.SyncResource;

public class _ATProtocol implements ATProtocol {

    protected final ServerResource server;
    protected final RepoResource repo;
    protected final SyncResource sync;

    public _ATProtocol(String uri) {
        this.server = new _ServerResource(uri);
        this.repo = new _RepoResource(uri);
        this.sync = new _SyncResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerResource server() {
        return server;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RepoResource repo() {
        return repo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncResource sync() {
        return sync;
    }
}
