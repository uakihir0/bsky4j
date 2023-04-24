package bsky4j.stream.internal.atproto;

import bsky4j.ATProtocol;
import bsky4j.ATProtocolException;
import bsky4j.ATProtocolTypes;
import bsky4j.stream.api.atproto.SyncResource;
import bsky4j.stream.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.stream.util.StreamClient;

import java.net.URL;

public class _SyncResource implements SyncResource {

    private final ATProtocol atproto;
    private final String uri;

    _SyncResource(
            ATProtocol atproto,
            String uri
    ) {
        this.atproto = atproto;
        this.uri = uri;
    }

    @Override
    public StreamClient subscribeRepos(
            SyncSubscribeReposRequest request
    ) {
        try {
            String url = "wss://" + new URL(this.uri).getHost()
                    + "/xrpc/" + ATProtocolTypes.SyncSubscribeRepos;
            return new StreamClient(atproto, url);

        } catch (Exception e) {
            throw new ATProtocolException(e);
        }
    }
}
