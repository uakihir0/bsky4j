package bsky4j.model.bsky.undoc;

public class UndocSearchFeedsPost {

    private Long createdAt;
    private String text;
    private String user;

    // region
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    // endregion
}
