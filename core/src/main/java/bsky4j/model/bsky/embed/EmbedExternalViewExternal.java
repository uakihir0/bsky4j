package bsky4j.model.bsky.embed;

import javax.annotation.Nullable;

public class EmbedExternalViewExternal {

    private String uri;
    private String title;
    private String description;
    @Nullable
    private String thumb;

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
    public String getThumb() {
        return thumb;
    }

    public void setThumb(@Nullable String thumb) {
        this.thumb = thumb;
    }
    // endregion
}
