package bsky4j.model.bsky.embed;

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
