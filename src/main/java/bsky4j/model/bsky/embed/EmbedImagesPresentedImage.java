package bsky4j.model.bsky.embed;

public class EmbedImagesPresentedImage {

    private String thumb;
    private String fullsize;
    private String alt;

    // region // Getter&Setter
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getFullsize() {
        return fullsize;
    }

    public void setFullsize(String fullsize) {
        this.fullsize = fullsize;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    // endregion
}
