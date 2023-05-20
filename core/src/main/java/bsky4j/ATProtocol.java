package bsky4j;

import bsky4j.api.atproto.IdentityResource;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.atproto.ServerResource;

public interface ATProtocol {

    IdentityResource identity();

    ServerResource server();

    RepoResource repo();


}
