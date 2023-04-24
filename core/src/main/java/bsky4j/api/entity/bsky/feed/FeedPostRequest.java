package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.internal.share._InternalUtility;
import bsky4j.model.bsky.embed.EmbedUnion;
import bsky4j.model.bsky.feed.FeedPost;
import bsky4j.model.bsky.feed.FeedPostReplyRef;
import bsky4j.model.bsky.richtext.RichtextFacet;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedPostRequest extends AuthRequest implements MapRequest {
    FeedPostRequest(String accessJwt) {
        super(accessJwt);
    }

    private String text;
    @Nullable
    private List<RichtextFacet> facets;
    @Nullable
    private FeedPostReplyRef reply;
    @Nullable
    private EmbedUnion embed;
    private String createdAt;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "text", getText());
        addParam(map, "facets", getFacets());
        addParam(map, "reply", getReply());
        addParam(map, "embed", getEmbed());
        addParam(map, "createdAt", getCreatedAt());
        return map;
    }

    public FeedPost toPost() {
        FeedPost post = new FeedPost();
        post.setText(getText());
        post.setFacets(getFacets());
        post.setReply(getReply());
        post.setEmbed(getEmbed());
        post.setCreatedAt(getCreatedAt());
        return post;
    }

    // region
    public static FeedPostRequestBuilder builder() {
        return new FeedPostRequestBuilder();
    }

    public String getText() {
        return text;
    }

    @Nullable
    public List<RichtextFacet> getFacets() {
        return facets;
    }

    @Nullable
    public FeedPostReplyRef getReply() {
        return reply;
    }

    @Nullable
    public EmbedUnion getEmbed() {
        return embed;
    }

    public String getCreatedAt() {
        if (createdAt == null) {
            return _InternalUtility.dateFormat.format(new Date());
        }
        return createdAt;
    }

    public static final class FeedPostRequestBuilder {
        private String text;
        private List<RichtextFacet> facets;
        private FeedPostReplyRef reply;
        private EmbedUnion embed;
        private String createdAt;
        private String accessJwt;

        private FeedPostRequestBuilder() {
        }

        public static FeedPostRequestBuilder aFeedPostRequest() {
            return new FeedPostRequestBuilder();
        }

        public FeedPostRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public FeedPostRequestBuilder facets(List<RichtextFacet> facets) {
            this.facets = facets;
            return this;
        }

        public FeedPostRequestBuilder reply(FeedPostReplyRef reply) {
            this.reply = reply;
            return this;
        }

        public FeedPostRequestBuilder embed(EmbedUnion embed) {
            this.embed = embed;
            return this;
        }

        public FeedPostRequestBuilder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FeedPostRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public FeedPostRequest build() {
            FeedPostRequest feedPostRequest = new FeedPostRequest(accessJwt);
            feedPostRequest.facets = this.facets;
            feedPostRequest.text = this.text;
            feedPostRequest.embed = this.embed;
            feedPostRequest.reply = this.reply;
            feedPostRequest.createdAt = this.createdAt;
            return feedPostRequest;
        }
    }
    // endregion
}