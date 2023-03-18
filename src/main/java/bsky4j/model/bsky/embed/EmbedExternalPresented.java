package bsky4j.model.bsky.embed;

public class EmbedExternalPresented implements EmbedExternal {

    @Override
    public String getType() {
        return "app.bsky.embed.external#presented";
    }

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
