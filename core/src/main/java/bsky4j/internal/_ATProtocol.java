package bsky4j.internal;

import bsky4j.ATProtocol;
import bsky4j.api.atproto.IdentityResource;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;
import bsky4j.internal.atproto._IdentityResource;
import bsky4j.internal.atproto._RepoResource;
import bsky4j.internal.atproto._ServerResource;

public class _ATProtocol implements ATProtocol {

    protected final IdentityResource identity;
    protected final ServerResource server;
    protected final RepoResource repo;

    public _ATProtocol(String uri) {
        this.identity = new _IdentityResource(uri);
        this.server = new _ServerResource(uri);
        this.repo = new _RepoResource(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentityResource identity() {
        return identity;
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
