package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorDefsProfileViewBasic;
import bsky4j.model.bsky.embed.EmbedViewUnion;
import bsky4j.model.share.RecordUnion;

public class FeedDefsPostView {

    private String uri;
    private String cid;
    private ActorDefsProfileViewBasic author;
    private RecordUnion record;
    private EmbedViewUnion embed;
    private Integer replyCount;
    private Integer repostCount;
    private Integer likeCount;
    private String indexedAt;
    private FeedDefsViewerState viewer;

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

    public ActorDefsProfileViewBasic getAuthor() {
        return author;
    }

    public void setAuthor(ActorDefsProfileViewBasic author) {
        this.author = author;
    }

    public RecordUnion getRecord() {
        return record;
    }

    public void setRecord(RecordUnion record) {
        this.record = record;
    }

    public EmbedViewUnion getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedViewUnion embed) {
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

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }

    public FeedDefsViewerState getViewer() {
        return viewer;
    }

    public void setViewer(FeedDefsViewerState viewer) {
        this.viewer = viewer;
    }
    // endregion
}
