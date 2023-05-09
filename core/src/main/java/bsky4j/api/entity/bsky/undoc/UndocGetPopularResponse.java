package bsky4j.api.entity.bsky.undoc;

import bsky4j.model.bsky.feed.FeedDefsFeedViewPost;

import java.util.List;

public class UndocGetPopularResponse {

    private String cursor;
    private List<FeedDefsFeedViewPost> feed;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<FeedDefsFeedViewPost> getFeed() {
        return feed;
    }

    public void setFeed(List<FeedDefsFeedViewPost> feed) {
        this.feed = feed;
    }
    // endregion
}
