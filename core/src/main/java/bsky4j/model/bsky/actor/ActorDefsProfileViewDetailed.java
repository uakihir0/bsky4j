package bsky4j.model.bsky.actor;

import bsky4j.model.atproto.label.LabelDefsLabel;

import javax.annotation.Nullable;
import java.util.List;

public class ActorDefsProfileViewDetailed {

    private String did;
    private String handle;
    @Nullable
    private String displayName;
    @Nullable
    private String description;
    @Nullable
    private String avatar;
    @Nullable
    private String banner;
    @Nullable
    private Integer followersCount;
    @Nullable
    private Integer followsCount;
    @Nullable
    private Integer postsCount;
    @Nullable
    private String indexedAt;
    @Nullable
    private ActorDefsViewerState viewer;
    @Nullable
    private List<LabelDefsLabel> labels;

    // region
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@Nullable String displayName) {
        this.displayName = displayName;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public String getBanner() {
        return banner;
    }

    public void setBanner(@Nullable String banner) {
        this.banner = banner;
    }

    @Nullable
    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(@Nullable Integer followersCount) {
        this.followersCount = followersCount;
    }

    @Nullable
    public Integer getFollowsCount() {
        return followsCount;
    }

    public void setFollowsCount(@Nullable Integer followsCount) {
        this.followsCount = followsCount;
    }

    @Nullable
    public Integer getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(@Nullable Integer postsCount) {
        this.postsCount = postsCount;
    }

    @Nullable
    public String getIndexedAt() {
        return indexedAt;
    }

    public void setIndexedAt(@Nullable String indexedAt) {
        this.indexedAt = indexedAt;
    }

    @Nullable
    public ActorDefsViewerState getViewer() {
        return viewer;
    }

    public void setViewer(@Nullable ActorDefsViewerState viewer) {
        this.viewer = viewer;
    }

    @Nullable
    public List<LabelDefsLabel> getLabels() {
        return labels;
    }

    public void setLabels(@Nullable List<LabelDefsLabel> labels) {
        this.labels = labels;
    }
    // endregion
}
