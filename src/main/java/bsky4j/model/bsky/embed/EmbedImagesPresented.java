package bsky4j.model.bsky.embed;

import bsky4j.domain.Service;

import java.util.List;

public class EmbedImagesPresented implements EmbedExternal {

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
