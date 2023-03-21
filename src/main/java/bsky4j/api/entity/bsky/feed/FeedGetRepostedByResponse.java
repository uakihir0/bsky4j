package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedGetRepostedByRepostedBy;

import javax.annotation.Nullable;
import java.util.List;

public class FeedGetRepostedByResponse {

    private String uri;
    @Nullable
    private String cid;
    @Nullable
    private String cursor;
    private List<FeedGetRepostedByRepostedBy> repostedBy;

    // region // Getter&Setter
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Nullable
    public String getCid() {
        return cid;
    }

    public void setCid(@Nullable String cid) {
        this.cid = cid;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(@Nullable String cursor) {
        this.cursor = cursor;
    }

    public List<FeedGetRepostedByRepostedBy> getRepostedBy() {
        return repostedBy;
    }

    public void setRepostedBy(List<FeedGetRepostedByRepostedBy> repostedBy) {
        this.repostedBy = repostedBy;
    }
    // endregion
}
