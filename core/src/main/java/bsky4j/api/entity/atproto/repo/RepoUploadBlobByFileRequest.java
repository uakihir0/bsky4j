package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.AuthRequest;

import javax.annotation.Nullable;
import java.io.File;

public class RepoUploadBlobByFileRequest extends AuthRequest implements RepoUploadBlobRequest {

    RepoUploadBlobByFileRequest(String accessJwt) {
        super(accessJwt);
    }

    @Nullable
    private File file;

    // region
    public static RepoUploadBlobByFileRequestBuilder builder() {
        return new RepoUploadBlobByFileRequestBuilder();
    }

    @Nullable
    public File getFile() {
        return file;
    }

    public static final class RepoUploadBlobByFileRequestBuilder {
        private File file;
        private String accessJwt;

        private RepoUploadBlobByFileRequestBuilder() {
        }

        public RepoUploadBlobByFileRequestBuilder file(File file) {
            this.file = file;
            return this;
        }

        public RepoUploadBlobByFileRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public RepoUploadBlobByFileRequest build() {
            RepoUploadBlobByFileRequest repoUploadBlobByFileRequest = new RepoUploadBlobByFileRequest(accessJwt);
            repoUploadBlobByFileRequest.file = this.file;
            return repoUploadBlobByFileRequest;
        }
    }
    // endregion
}
