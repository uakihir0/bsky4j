package bsky4j.api.entity.bsky.feed;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;
import bsky4j.model.bsky.embed.EmbedExternalUnion;
import bsky4j.model.bsky.feed.FeedPostEntity;
import bsky4j.model.bsky.feed.FeedPostReplyRef;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedPostRequest extends AuthRequest implements MapRequest {
    FeedPostRequest(String accessJwt) {
        super(accessJwt);
    }

    private String text;
    @Nullable
    private List<FeedPostEntity> entities;
    @Nullable
    private FeedPostReplyRef reply;
    @Nullable
    private EmbedExternalUnion embed;
    private String createdAt;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "text", getText());
        addParam(map, "entities", getEntities());
        addParam(map, "direction", getReply());
        addParam(map, "limit", getEmbed());
        addParam(map, "before", getCreatedAt());
        return map;
    }

    // region
    public static FeedPostRequestBuilder builder() {
        return new FeedPostRequestBuilder();
    }

    public String getText() {
        return text;
    }

    @Nullable
    public List<FeedPostEntity> getEntities() {
        return entities;
    }

    @Nullable
    public FeedPostReplyRef getReply() {
        return reply;
    }

    @Nullable
    public EmbedExternalUnion getEmbed() {
        return embed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public static final class FeedPostRequestBuilder {
        private String text;
        private List<FeedPostEntity> entities;
        private FeedPostReplyRef reply;
        private EmbedExternalUnion embed;
        private String createdAt;
        private String accessJwt;

        private FeedPostRequestBuilder() {
        }

        public FeedPostRequestBuilder text(String text) {
            this.text = text;
            return this;
        }

        public FeedPostRequestBuilder entities(List<FeedPostEntity> entities) {
            this.entities = entities;
            return this;
        }

        public FeedPostRequestBuilder reply(FeedPostReplyRef reply) {
            this.reply = reply;
            return this;
        }

        public FeedPostRequestBuilder embed(EmbedExternalUnion embed) {
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
            feedPostRequest.reply = this.reply;
            feedPostRequest.createdAt = this.createdAt;
            feedPostRequest.entities = this.entities;
            feedPostRequest.embed = this.embed;
            feedPostRequest.text = this.text;
            return feedPostRequest;
        }
    }
    // endregion
}
