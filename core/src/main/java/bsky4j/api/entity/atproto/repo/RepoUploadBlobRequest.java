package bsky4j.api.entity.atproto.repo;

public interface RepoUploadBlobRequest {

    static RepoUploadBlobByFileRequest.RepoUploadBlobByFileRequestBuilder fromFileBuilder() {
        return RepoUploadBlobByFileRequest.builder();
    }

    static RepoUploadBlobByStreamRequest.RepoUploadBlobByStreamRequestBuilder fromStreamBuilder() {
        return RepoUploadBlobByStreamRequest.builder();
    }
}
