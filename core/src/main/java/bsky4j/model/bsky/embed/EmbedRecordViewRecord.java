package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import bsky4j.model.atproto.label.LabelDefsLabel;
import bsky4j.model.bsky.actor.ActorDefsProfileViewBasic;
import bsky4j.model.share.RecordUnion;

import java.util.List;

public class EmbedRecordViewRecord implements EmbedRecordViewUnion {

    public static final String TYPE = BlueskyTypes.EmbedRecord + "#viewRecord";

    @Override
    public String getType() {
        return TYPE;
    }

    private String uri;
    private String cid;
    private ActorDefsProfileViewBasic author;
    private RecordUnion value;
    private List<LabelDefsLabel> labels;
    private List<EmbedViewUnion> embeds;
    private String indexedAt;

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

    public RecordUnion getValue() {
        return value;
    }

    public void setValue(RecordUnion value) {
        this.value = value;
    }

    public List<LabelDefsLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelDefsLabel> labels) {
        this.labels = labels;
    }

    public List<EmbedViewUnion> getEmbeds() {
        return embeds;
    }

    public void setEmbeds(List<EmbedViewUnion> embeds) {
        this.embeds = embeds;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }
    // endregion
}
