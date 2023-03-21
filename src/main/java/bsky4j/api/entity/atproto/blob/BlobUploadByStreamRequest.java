package bsky4j.api.entity.atproto.blob;

import bsky4j.api.entity.share.AuthRequest;

import java.io.InputStream;

public class BlobUploadByStreamRequest extends AuthRequest implements BlobUploadRequest {

    BlobUploadByStreamRequest(String accessJwt) {
        super(accessJwt);
    }

    private InputStream stream;
    private String name;


    // region
    public static BlobUploadByStreamRequestBuilder builder() {
        return new BlobUploadByStreamRequestBuilder();
    }


    public InputStream getStream() {
        return stream;
    }

    public String getName() {
        return name;
    }

    public static final class BlobUploadByStreamRequestBuilder {
        private InputStream stream;
        private String name;
        private String accessJwt;

        private BlobUploadByStreamRequestBuilder() {
        }

        public BlobUploadByStreamRequestBuilder stream(InputStream stream) {
            this.stream = stream;
            return this;
        }

        public BlobUploadByStreamRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BlobUploadByStreamRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public BlobUploadByStreamRequest build() {
            BlobUploadByStreamRequest blobUploadByStreamRequest = new BlobUploadByStreamRequest(accessJwt);
            blobUploadByStreamRequest.name = this.name;
            blobUploadByStreamRequest.stream = this.stream;
            return blobUploadByStreamRequest;
        }
    }

    // endregion
}
