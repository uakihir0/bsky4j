package bsky4j;

import bsky4j.api.atproto.BlobResource;
import bsky4j.api.atproto.SessionResource;

public interface ATProtocol {

    SessionResource session();

    BlobResource blob();
}
