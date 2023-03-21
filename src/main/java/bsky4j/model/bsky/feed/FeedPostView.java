package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorRefWithInfo;
import bsky4j.model.bsky.embed.EmbedExternalUnion;

public class FeedPostView {
    private String uri;
    private String cid;
    private ActorRefWithInfo author;
    private FeedRecordUnion record;
    private EmbedExternalUnion embed;
    private Integer replyCount;
    private Integer repostCount;
    private Integer upvoteCount;
    private Integer downvoteCount;
    private String indexedAt;
    private FeedPostViewerState viewer;

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

    public ActorRefWithInfo getAuthor() {
        return author;
    }

    public void setAuthor(ActorRefWithInfo author) {
        this.author = author;
    }

    public FeedRecordUnion getRecord() {
        return record;
    }

    public void setRecord(FeedRecordUnion record) {
        this.record = record;
    }

    public EmbedExternalUnion getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedExternalUnion embed) {
        this.embed = embed;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getRepostCount() {
        return repostCount;
    }

    public void setRepostCount(Integer repostCount) {
        this.repostCount = repostCount;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public void setDownvoteCount(Integer downvoteCount) {
        this.downvoteCount = downvoteCount;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }

    public FeedPostViewerState getViewer() {
        return viewer;
    }

    public void setViewer(FeedPostViewerState viewer) {
        this.viewer = viewer;
    }
    // endregion
}
