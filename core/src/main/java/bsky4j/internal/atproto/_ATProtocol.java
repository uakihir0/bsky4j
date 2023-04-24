package bsky4j.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;

public class _ATProtocol implements ATProtocol {

    protected final ServerResource server;
    protected final RepoResource repo;

    public _ATProtocol(String uri) {
        this.server = new _ServerResource(uri);
        this.repo = new _RepoResource(uri);
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
}
