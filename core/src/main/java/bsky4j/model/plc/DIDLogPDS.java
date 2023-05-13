package bsky4j.model.plc;

public class DIDLogPDS {

    private String type;
    private String endpoint;

    // region
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    // endregion
}
