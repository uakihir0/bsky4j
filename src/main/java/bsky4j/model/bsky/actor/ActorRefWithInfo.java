package bsky4j.model.bsky.actor;

import bsky4j.model.bsky.system.SystemDeclRefMain;

import javax.annotation.Nullable;

public class ActorRefWithInfo {

    private String did;
    private SystemDeclRefMain declaration;
    private String handle;
    @Nullable
    private String displayName;
    @Nullable
    private String avatar;
    @Nullable
    private ActorRefViewerState viewer;

    // region // Getter&Setter
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public SystemDeclRefMain getDeclaration() {
        return declaration;
    }

    public void setDeclaration(SystemDeclRefMain declaration) {
        this.declaration = declaration;
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
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public ActorRefViewerState getViewer() {
        return viewer;
    }

    public void setViewer(@Nullable ActorRefViewerState viewer) {
        this.viewer = viewer;
    }
    // endregion
}
