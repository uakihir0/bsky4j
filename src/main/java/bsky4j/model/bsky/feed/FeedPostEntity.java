package bsky4j.model.bsky.feed;

public class FeedPostEntity {

    private FeedPostTextSlice index;
    /**
     * Expected values are 'mention', 'hashtag', and 'link'.
     */
    private String type;
    private String value;

    // region // Getter&Setter
    public FeedPostTextSlice getIndex() {
        return index;
    }

    public void setIndex(FeedPostTextSlice index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    // endregion
}
