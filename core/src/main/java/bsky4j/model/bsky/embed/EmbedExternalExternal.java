package bsky4j.model.bsky.embed;

import bsky4j.model.share.Blob;

import javax.annotation.Nullable;

public class EmbedExternalExternal {

    private String uri;
    private String title;
    private String description;
    @Nullable
    private Blob thumb;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Nullable
    public Blob getThumb() {
        return thumb;
    }

    public void setThumb(@Nullable Blob thumb) {
        this.thumb = thumb;
    }
    // endregion
}
