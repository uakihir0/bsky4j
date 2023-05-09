package bsky4j.model.atproto.label;

/**
 * Metadata tag on an atproto resource (eg, repo or record)
 */
public class LabelDefsLabel {

    /**
     * DID of the actor who created this label
     */
    private String src;

    /**
     * AT URI of the record, repository (account), or other resource which this label applies to
     */
    private String uri;

    /**
     * optionally, CID specifying the specific version of 'uri' resource this label applies to
     */
    private String cid;

    /**
     * the short string name of the value or type of this label
     */
    private String val;

    /**
     * if true, this is a negation label, overwriting a previous label
     */
    private String neg;

    /**
     * timestamp when this label was created
     */
    private String cts;

    // region
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getNeg() {
        return neg;
    }

    public void setNeg(String neg) {
        this.neg = neg;
    }

    public String getCts() {
        return cts;
    }

    public void setCts(String cts) {
        this.cts = cts;
    }
    // endregion
}
