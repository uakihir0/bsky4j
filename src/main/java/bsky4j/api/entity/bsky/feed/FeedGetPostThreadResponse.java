package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedGetPostThreadUnion;

public class FeedGetPostThreadResponse {

    private FeedGetPostThreadUnion thread;

    // region // Getter&Setter
    public FeedGetPostThreadUnion getThread() {
        return thread;
    }

    public void setThread(FeedGetPostThreadUnion thread) {
        this.thread = thread;
    }
    // endregion
}
