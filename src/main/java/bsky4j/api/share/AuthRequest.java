package bsky4j.api.share;

public class AuthRequest {

    private final String accessJwt;

    protected AuthRequest(String accessJwt) {
        this.accessJwt = accessJwt;
    }

    public String getAccessJwt() {
        return accessJwt;
    }

    public String getBearerToken(){
        return "Bearer " + getAccessJwt();
    }
}
