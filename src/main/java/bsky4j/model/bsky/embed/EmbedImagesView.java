package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;

import java.util.List;

public class EmbedImagesView implements EmbedViewUnion {
    public static final String TYPE = BlueskyTypes.EmbedImages + "#view";

    @Override
    public String getType() {
        return TYPE;
    }

    private List<EmbedImagesViewImage> images;

    // region
    public List<EmbedImagesViewImage> getImages() {
        return images;
    }

    public void setImages(List<EmbedImagesViewImage> images) {
        this.images = images;
    }
    // endregion
}
