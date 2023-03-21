package bsky4j.api.atproto;

import bsky4j.api.entity.atproto.blob.BlobUploadByFileRequest;
import bsky4j.api.entity.atproto.blob.BlobUploadRequest;
import bsky4j.api.entity.atproto.blob.BlobUploadResponse;
import bsky4j.api.entity.share.Response;

/**
 * ATProtocol/Blob
 * https://atproto.com/lexicons/com-atproto-blob
 */
public interface BlobResource {

    /**
     * Upload a new blob to be added to repo in a later request.
     */
    Response<BlobUploadResponse> upload(BlobUploadRequest request);
}
