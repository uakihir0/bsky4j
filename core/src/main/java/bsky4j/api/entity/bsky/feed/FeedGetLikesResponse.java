package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedGetLikesLike;

import java.util.List;

public class FeedGetLikesResponse {

    private String uri;
    private String cid;
    private String cursor;
    private List<FeedGetLikesLike> likes;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<FeedGetLikesLike> getLikes() {
        return likes;
    }

    public void setLikes(List<FeedGetLikesLike> likes) {
        this.likes = likes;
    }
    // endregion
}
