package bsky4j.model.bsky.feed;

public class FeedGetPostThreadNotFoundPost implements FeedGetPostThreadUnion {

    @Override
    public String getType() {
        return "app.bsky.feed.getPostThread#notFoundPost";
    }

    private String uri;
    private Boolean notFound = true;

    // region // Getter&Setter
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getNotFound() {
        return notFound;
    }

    public void setNotFound(Boolean notFound) {
        this.notFound = notFound;
    }
    // endregion
}
