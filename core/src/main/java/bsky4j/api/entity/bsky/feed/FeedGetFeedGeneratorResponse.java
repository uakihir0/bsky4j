package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsGeneratorView;

public class FeedGetFeedGeneratorResponse {

    private FeedDefsGeneratorView view;
    private Boolean isOnline;
    private Boolean isValid;

    // region
    public FeedDefsGeneratorView getView() {
        return view;
    }

    public void setView(FeedDefsGeneratorView view) {
        this.view = view;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }
    // endregion
}


