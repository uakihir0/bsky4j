package bsky4j.model.bsky.actor;

import bsky4j.BlueskyTypes;
import bsky4j.model.share.Blob;
import bsky4j.model.share.RecordUnion;

public class ActorProfile implements RecordUnion {

    public final static String TYPE = BlueskyTypes.ActorProfile;

    @Override
    public String getType() {
        return TYPE;
    }

    private String displayName;
    private String description;
    private Blob avatar;
    private Blob banner;

    // region
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

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public Blob getBanner() {
        return banner;
    }

    public void setBanner(Blob banner) {
        this.banner = banner;
    }
    // endregion
}
