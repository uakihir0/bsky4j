package bsky4j.api.entity.bsky.undoc;

import bsky4j.model.bsky.undoc.UndocSearchFeedsPost;
import bsky4j.model.bsky.undoc.UndocSearchFeedsUser;

public class UndocSearchFeedsResponse {

    private String cid;
    private String tid;
    private UndocSearchFeedsUser user;
    private UndocSearchFeedsPost post;

    // region
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public UndocSearchFeedsUser getUser() {
        return user;
    }

    public void setUser(UndocSearchFeedsUser user) {
        this.user = user;
    }

    public UndocSearchFeedsPost getPost() {
        return post;
    }

    public void setPost(UndocSearchFeedsPost post) {
        this.post = post;
    }
    // endregion
}
