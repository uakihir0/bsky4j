package bsky4j.model.plc;

public class DIDDetailsVerificationMethod {

    private String id;
    private String type;
    private String controller;
    private String publicKeyMultibase;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getPublicKeyMultibase() {
        return publicKeyMultibase;
    }

    public void setPublicKeyMultibase(String publicKeyMultibase) {
        this.publicKeyMultibase = publicKeyMultibase;
    }
    // endregion
}
