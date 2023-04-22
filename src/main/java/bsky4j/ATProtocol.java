package bsky4j;

import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;
import bsky4j.api.atproto.SyncResource;

public interface ATProtocol {

    ServerResource server();

    RepoResource repo();

    SyncResource sync();
}
