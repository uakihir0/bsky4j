package bsky4j.api.entity.atproto.repo;

import bsky4j.api.entity.share.AuthRequest;

import java.io.InputStream;

public class RepoUploadBlobByStreamRequest extends AuthRequest implements RepoUploadBlobRequest {

    RepoUploadBlobByStreamRequest(String accessJwt) {
        super(accessJwt);
    }

    private InputStream stream;
    private String name;

    // region
    public static RepoUploadBlobByStreamRequestBuilder builder() {
        return new RepoUploadBlobByStreamRequestBuilder();
    }

    public InputStream getStream() {
        return stream;
    }

    public String getName() {
        return name;
    }

    public static final class RepoUploadBlobByStreamRequestBuilder {
        private InputStream stream;
        private String name;
        private String accessJwt;

        private RepoUploadBlobByStreamRequestBuilder() {
        }

        public RepoUploadBlobByStreamRequestBuilder stream(InputStream stream) {
            this.stream = stream;
            return this;
        }

        public RepoUploadBlobByStreamRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RepoUploadBlobByStreamRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public RepoUploadBlobByStreamRequest build() {
            RepoUploadBlobByStreamRequest repoUploadBlobByStreamRequest = new RepoUploadBlobByStreamRequest(accessJwt);
            repoUploadBlobByStreamRequest.stream = this.stream;
            repoUploadBlobByStreamRequest.name = this.name;
            return repoUploadBlobByStreamRequest;
        }
    }
    // endregion

}
