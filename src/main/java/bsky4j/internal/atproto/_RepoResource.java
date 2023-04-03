package bsky4j.internal.atproto;

import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobByFileRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobByStreamRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.util.Bsky4JClientConfiguration;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _RepoResource  implements RepoResource {

    private final String uri;

    _RepoResource(String uri) {
        this.uri = uri;
    }


    @Override
    public void applyWrites() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void describeRepo() {

    }

    @Override
    public void getRecord() {

    }

    @Override
    public void listRecords() {

    }

    @Override
    public void putRecord() {

    }

    @Override
    public Response<RepoUploadBlobResponse> uploadBlob(RepoUploadBlobRequest request) {
        return proceed(RepoUploadBlobResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder(new Bsky4JClientConfiguration())
                            .target(this.uri)
                            .path(ATProtocolTypes.RepoUploadBlob);

            // From file
            if (request instanceof RepoUploadBlobByFileRequest) {
                RepoUploadBlobByFileRequest f = (RepoUploadBlobByFileRequest) request;
                builder.header("Authorization", f.getBearerToken());
                builder.file("file", f.getFile());
            }

            // From InputStream
            if (request instanceof RepoUploadBlobByStreamRequest) {
                RepoUploadBlobByStreamRequest s = (RepoUploadBlobByStreamRequest) request;
                builder.header("Authorization", s.getBearerToken());
                builder.file("file", s.getStream(), s.getName());
            }

            return builder.request(HttpMediaType.APPLICATION_JSON).post();
        });
    }
}
