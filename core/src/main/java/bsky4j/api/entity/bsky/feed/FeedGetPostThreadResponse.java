package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsThreadUnion;

public class FeedGetPostThreadResponse {

    private FeedDefsThreadUnion thread;

    // region
    public FeedDefsThreadUnion getThread() {
        return thread;
    }

    public void setThread(FeedDefsThreadUnion thread) {
        this.thread = thread;
    }
    // endregion
}
