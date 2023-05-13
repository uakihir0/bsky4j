package bsky4j.model.plc;

import java.util.List;

public class DIDLog {

    private String sig;
    private String prev;
    private String type;
    private DIDLogService services;
    private List<String> alsoKnownAs;
    private List<String> rotationKeys;
    private DIDLogVerificationMethods verificationMethods;

    // region
    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DIDLogService getServices() {
        return services;
    }

    public void setServices(DIDLogService services) {
        this.services = services;
    }

    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(List<String> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public List<String> getRotationKeys() {
        return rotationKeys;
    }

    public void setRotationKeys(List<String> rotationKeys) {
        this.rotationKeys = rotationKeys;
    }

    public DIDLogVerificationMethods getVerificationMethods() {
        return verificationMethods;
    }

    public void setVerificationMethods(DIDLogVerificationMethods verificationMethods) {
        this.verificationMethods = verificationMethods;
    }
    // endregion
}
