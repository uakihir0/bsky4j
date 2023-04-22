package bsky4j.internal.atproto;

import bsky4j.ATProtocolException;
import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.SyncResource;
import bsky4j.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.util.ws.StreamClient;

import java.net.URL;

public class _SyncResource implements SyncResource {

    private final String uri;

    _SyncResource(String uri) {
        this.uri = uri;
    }

    @Override
    public StreamClient subscribeRepos(
            SyncSubscribeReposRequest request
    ) {
        try {
            String url = "wss://" + new URL(this.uri).getHost()
                    + "/xrpc/" + ATProtocolTypes.SyncSubscribeRepos;
            return new StreamClient(url);

        } catch (Exception e) {
            throw new ATProtocolException(e);
        }
    }
}
