package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedViewPostMain;

import javax.annotation.Nullable;
import java.util.List;

public class FeedGetTimelineResponse {
    @Nullable
    private String cursor;
    private List<FeedViewPostMain> feed;

    // region Getter&Setter
    @Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(@Nullable String cursor) {
        this.cursor = cursor;
    }

    public List<FeedViewPostMain> getFeed() {
        return feed;
    }

    public void setFeed(List<FeedViewPostMain> feed) {
        this.feed = feed;
    }
    // endregion
}
