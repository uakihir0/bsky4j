package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorDefsProfileView;
import bsky4j.model.bsky.richtext.RichtextFacet;

import java.util.List;

public class FeedDefsGeneratorView {

    private String uri;
    private String cid;
    private String did;
    private ActorDefsProfileView creator;
    private String displayName;
    private String description;
    private List<RichtextFacet> descriptionFacets;
    private String avatar;
    private Integer likeCount;
    private FeedDefsGeneratorViewerState viewer;
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

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public ActorDefsProfileView getCreator() {
        return creator;
    }

    public void setCreator(ActorDefsProfileView creator) {
        this.creator = creator;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RichtextFacet> getDescriptionFacets() {
        return descriptionFacets;
    }

    public void setDescriptionFacets(List<RichtextFacet> descriptionFacets) {
        this.descriptionFacets = descriptionFacets;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public FeedDefsGeneratorViewerState getViewer() {
        return viewer;
    }

    public void setViewer(FeedDefsGeneratorViewerState viewer) {
        this.viewer = viewer;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
    }
    // endregion
}
