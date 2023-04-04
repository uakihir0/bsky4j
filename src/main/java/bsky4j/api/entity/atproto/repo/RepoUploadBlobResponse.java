package bsky4j.api.entity.atproto.repo;

import bsky4j.model.share.Blob;

public class RepoUploadBlobResponse {

    private Blob blob;

    // region
    public Blob getBlob() {
        return blob;
    }

    public void setBlob(Blob blob) {
        this.blob = blob;
    }
    // endregion
}
