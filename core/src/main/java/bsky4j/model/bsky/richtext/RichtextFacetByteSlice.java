package bsky4j.model.bsky.richtext;

/**
 * A text segment. Start is inclusive, end is exclusive. Indices are for utf8-encoded strings.
 */
public class RichtextFacetByteSlice {

    private Integer byteStart;
    private Integer byteEnd;

    // region
    public Integer getByteStart() {
        return byteStart;
    }

    public void setByteStart(Integer byteStart) {
        this.byteStart = byteStart;
    }

    public Integer getByteEnd() {
        return byteEnd;
    }

    public void setByteEnd(Integer byteEnd) {
        this.byteEnd = byteEnd;
    }
    // endregion
}
