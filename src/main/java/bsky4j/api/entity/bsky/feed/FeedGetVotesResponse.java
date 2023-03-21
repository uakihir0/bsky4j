package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedGetVotesVote;

import java.util.List;

public class FeedGetVotesResponse {

    private String uri;
    private String cid;
    private String cursor;
    private List<FeedGetVotesVote> votes;

    // region // Getter&Setter
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

    public List<FeedGetVotesVote> getVotes() {
        return votes;
    }

    public void setVotes(List<FeedGetVotesVote> votes) {
        this.votes = votes;
    }
    // endregion
}
