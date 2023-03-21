package bsky4j.api.entity.atproto.blob;

public interface BlobUploadRequest {

    static BlobUploadByFileRequest.BlobUploadRequestByFileBuilder fromFileBuilder() {
        return BlobUploadByFileRequest.builder();
    }

    static BlobUploadByStreamRequest.BlobUploadByStreamRequestBuilder fromStreamBuilder() {
        return BlobUploadByStreamRequest.builder();
    }
}
