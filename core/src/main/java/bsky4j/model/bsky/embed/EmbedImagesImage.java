package bsky4j.model.bsky.embed;

import bsky4j.model.share.Blob;

public class EmbedImagesImage {

    private Blob image;
    private String alt;

    // region
    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    // endregion
}
