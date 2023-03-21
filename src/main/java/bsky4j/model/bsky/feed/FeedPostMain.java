package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.embed.EmbedExternalUnion;

import java.util.List;

public class FeedPostMain implements FeedRecordUnion {

    @Override
    public String getType() {
        return "app.bsky.feed.post";
    }

    private String text;
    private List<FeedPostEntity> entities;
    private FeedPostReplyRef reply;
    private EmbedExternalUnion embed;
    private String createdAt;

    // region // Getter&Setter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<FeedPostEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<FeedPostEntity> entities) {
        this.entities = entities;
    }

    public FeedPostReplyRef getReply() {
        return reply;
    }

    public void setReply(FeedPostReplyRef reply) {
        this.reply = reply;
    }

    public EmbedExternalUnion getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedExternalUnion embed) {
        this.embed = embed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    // endregion
}
