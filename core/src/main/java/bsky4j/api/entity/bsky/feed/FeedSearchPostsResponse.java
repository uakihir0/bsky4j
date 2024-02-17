package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsGeneratorView;
import bsky4j.model.bsky.feed.FeedDefsPostView;

import java.util.List;

public class FeedSearchPostsResponse {

    private String cursor;
    private Integer hitsTotal;
    private List<FeedDefsPostView> posts;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getHitsTotal() {
        return hitsTotal;
    }

    public void setHitsTotal(Integer hitsTotal) {
        this.hitsTotal = hitsTotal;
    }

    public List<FeedDefsPostView> getPosts() {
        return posts;
    }

    public void setPosts(List<FeedDefsPostView> posts) {
        this.posts = posts;
    }

    // endregion
}
