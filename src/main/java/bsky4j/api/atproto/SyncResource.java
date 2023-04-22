package bsky4j.api.atproto;

import bsky4j.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.util.ws.StreamClient;

/**
 * ATProtocol/Sync
 * <a href="https://atproto.com/lexicons/com-atproto-sync#comatprotosyncsubscriberepos">Reference</a>
 */
public interface SyncResource {

    /**
     * [WIP]
     * Subscribe to repo updates
     */
    StreamClient subscribeRepos(SyncSubscribeReposRequest request);
}
