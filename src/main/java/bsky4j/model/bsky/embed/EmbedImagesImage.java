package bsky4j.model.bsky.embed;

public class EmbedImagesImage {

    private EmbedImagesImageBlob image;
    private String alt;

    // region // Getter&Setter
    public EmbedImagesImageBlob getImage() {
        return image;
    }

    public void setImage(EmbedImagesImageBlob image) {
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
