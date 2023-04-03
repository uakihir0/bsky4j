package bsky4j;

import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;

public interface ATProtocol {

    ServerResource session();

    RepoResource repo();
}
