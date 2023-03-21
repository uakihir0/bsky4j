package bsky4j.api.entity.atproto.blob;

import bsky4j.api.entity.share.AuthRequest;

import javax.annotation.Nullable;
import java.io.File;


public class BlobUploadByFileRequest extends AuthRequest implements BlobUploadRequest {

    BlobUploadByFileRequest(String accessJwt) {
        super(accessJwt);
    }

    @Nullable
    private File file;

    // region
    public static BlobUploadRequestByFileBuilder builder() {
        return new BlobUploadRequestByFileBuilder();
    }

    @Nullable
    public File getFile() {
        return file;
    }

    public static final class BlobUploadRequestByFileBuilder {
        private File file;
        private String accessJwt;

        private BlobUploadRequestByFileBuilder() {
        }

        public BlobUploadRequestByFileBuilder file(File file) {
            this.file = file;
            return this;
        }

        public BlobUploadRequestByFileBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public BlobUploadByFileRequest build() {
            BlobUploadByFileRequest blobUploadByFileRequest = new BlobUploadByFileRequest(accessJwt);
            blobUploadByFileRequest.file = this.file;
            return blobUploadByFileRequest;
        }
    }
    // endregion
}
