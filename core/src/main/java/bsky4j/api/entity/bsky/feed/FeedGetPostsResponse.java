package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsPostView;

import java.util.List;

public class FeedGetPostsResponse {

    private List<FeedDefsPostView> posts;

    // region
    public List<FeedDefsPostView> getPosts() {
        return posts;
    }

    public void setPosts(List<FeedDefsPostView> posts) {
        this.posts = posts;
    }
    // endregion
}
