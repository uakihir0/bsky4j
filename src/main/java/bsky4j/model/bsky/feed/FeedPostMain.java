package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.embed.EmbedExternal;

import java.util.List;

public class FeedPostMain implements FeedRecord {

    @Override
    public String getType() {
        return "app.bsky.feed.post";
    }

    private String text;
    private List<FeedPostEntity> entities;
    private FeedPostReplyRef reply;
    private EmbedExternal embed;
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

    public EmbedExternal getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedExternal embed) {
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
