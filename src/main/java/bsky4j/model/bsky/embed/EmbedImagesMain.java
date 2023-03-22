package bsky4j.model.bsky.embed;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmbedImagesMain implements EmbedUnion {

    @SerializedName("$type")
    private String type = "app.bsky.embed.images";

    private List<EmbedImagesImage> images;

    // region // Getter&Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<EmbedImagesImage> getImages() {
        return images;
    }

    public void setImages(List<EmbedImagesImage> images) {
        this.images = images;
    }
    // endregion
}
