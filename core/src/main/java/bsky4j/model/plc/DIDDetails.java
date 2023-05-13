package bsky4j.model.plc;

import java.util.List;

public class DIDDetails {

    private String id;
    private List<String> alsoKnownAs;
    private List<DIDDetailsVerificationMethod> verificationMethod;
    private List<DIDDetailsService> service;

    // region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(List<String> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public List<DIDDetailsVerificationMethod> getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(List<DIDDetailsVerificationMethod> verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    public List<DIDDetailsService> getService() {
        return service;
    }

    public void setService(List<DIDDetailsService> service) {
        this.service = service;
    }
    // endregion
}
