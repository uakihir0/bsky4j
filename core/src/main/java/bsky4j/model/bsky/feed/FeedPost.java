package bsky4j.model.bsky.feed;

import bsky4j.BlueskyTypes;
import bsky4j.model.bsky.embed.EmbedUnion;
import bsky4j.model.bsky.richtext.RichtextFacet;
import bsky4j.model.share.RecordUnion;

import java.util.List;

public class FeedPost implements RecordUnion {

    public static final String TYPE = BlueskyTypes.FeedPost;

    @Override
    public String getType() {
        return TYPE;
    }

    private String text;
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

    public List<RichtextFacet> getFacets() {
        return facets;
    }

    public void setFacets(List<RichtextFacet> facets) {
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
