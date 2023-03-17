package bsky4j.model.bsky.embed;

import javax.annotation.Nullable;

public class EmbedExternalPresented implements EmbedExternal{

    private EmbedExternalPresentedExternal external;

    // region // Getter&Setter
    public EmbedExternalPresentedExternal getExternal() {
        return external;
    }

    public void setExternal(EmbedExternalPresentedExternal external) {
        this.external = external;
    }
    // endregion
}
