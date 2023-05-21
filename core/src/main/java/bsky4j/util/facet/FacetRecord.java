package bsky4j.util.facet;

public class FacetRecord {
    private FacetType type;
    private String contentText;
    private String displayText;

    public FacetRecord(
            FacetType type,
            String contentText,
            String displayText
    ) {
        this.type = type;
        this.contentText = contentText;
        this.displayText = displayText;
    }

    public FacetType getType() {
        return type;
    }

    public void setType(FacetType type) {
        this.type = type;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }
}
