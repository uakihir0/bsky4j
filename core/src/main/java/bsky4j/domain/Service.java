package bsky4j.domain;

public enum Service {
    BSKY_SOCIAL("https://bsky.social/"),
    ;

    private final String uri;

    public String getUri() {
        return uri;
    }

    Service(String uri) {
        this.uri = uri;
    }
}
