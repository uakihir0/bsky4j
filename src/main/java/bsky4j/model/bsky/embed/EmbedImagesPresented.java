package bsky4j.model.bsky.embed;

import java.util.List;

public class EmbedImagesPresented implements EmbedPresentedUnion {

    @Override
    public String getType() {
        return "app.bsky.embed.images#presented";
    }

    private List<EmbedImagesPresentedImage> images;

    // region // Getter&Setter
    public List<EmbedImagesPresentedImage> getImages() {
        return images;
    }

    public void setImages(List<EmbedImagesPresentedImage> images) {
        this.images = images;
    }
    // endregion
}
