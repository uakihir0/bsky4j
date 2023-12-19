package bsky4j.model.bsky.feed;

import java.util.List;

import javax.annotation.Nullable;

import bsky4j.BlueskyTypes;
import bsky4j.model.bsky.embed.EmbedUnion;
import bsky4j.model.bsky.richtext.RichtextFacet;
import bsky4j.model.share.RecordUnion;

public class FeedPost implements RecordUnion {

    public static final String TYPE = BlueskyTypes.FeedPost;

    @Override
    public String getType() {
        return TYPE;
    }

    private String text;

    @Nullable
    private List<RichtextFacet> facets;
    private FeedPostReplyRef reply;
    private EmbedUnion embed;
    private String createdAt;

    // region
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Nullable
    public List<RichtextFacet> getFacets() {
        return facets;
    }

    public void setFacets(@Nullable List<RichtextFacet> facets) {
        this.facets = facets;
    }

    public FeedPostReplyRef getReply() {
        return reply;
    }

    public void setReply(FeedPostReplyRef reply) {
        this.reply = reply;
    }

    public EmbedUnion getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedUnion embed) {
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
