package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedViewPostMain;

import java.util.List;

public class FeedGetAuthorFeedResponse {
    private List<FeedViewPostMain> feed;

    // region // Getter&Setter
    public List<FeedViewPostMain> getFeed() {
        return feed;
    }

    public void setFeed(List<FeedViewPostMain> feed) {
        this.feed = feed;
    }
    // endregion
}
