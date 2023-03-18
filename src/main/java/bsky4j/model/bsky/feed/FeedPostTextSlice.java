package bsky4j.model.bsky.feed;

/**
 * A text segment. Start is inclusive, end is exclusive.
 */
public class FeedPostTextSlice {
    private Integer start;
    private Integer end;

    // region // Getter&Setter
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
    // endregion
}
