package bsky4j.stream.util.callback;

import bsky4j.model.share.RecordUnion;

public interface EventCallback {

    void onEvent(String cid, String uri, RecordUnion record);
}
