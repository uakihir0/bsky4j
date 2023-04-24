package bsky4j.internal.atproto;

import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.RepoResource;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoCreateRecordResponse;
import bsky4j.api.entity.atproto.repo.RepoDeleteRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoGetRecordRequest;
import bsky4j.api.entity.atproto.repo.RepoGetRecordResponse;
import bsky4j.api.entity.atproto.repo.RepoListRecordsRequest;
import bsky4j.api.entity.atproto.repo.RepoListRecordsResponse;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobByFileRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobByStreamRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.util.Bsky4JClientConfiguration;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _RepoResource implements RepoResource {

    private final String uri;

    _RepoResource(String uri) {
        this.uri = uri;
    }


    @Override
    public void applyWrites() {

    }

    @Override
    public Response<RepoCreateRecordResponse> createRecord(
            RepoCreateRecordRequest request
    ) {
        return proceed(RepoCreateRecordResponse.class, () -> {

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolTypes.RepoCreateRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public Response<Void> deleteRecord(
            RepoDeleteRecordRequest request
    ) {
        return proceed(() -> {

            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(ATProtocolTypes.RepoDeleteRecord)
                    .header("Authorization", request.getBearerToken())
                    .request(HttpMediaType.APPLICATION_JSON)
                    .json(request.toJson())
                    .post();
        });
    }

    @Override
    public void describeRepo() {

    }

    @Override
    public Response<RepoGetRecordResponse> getRecord(
            RepoGetRecordRequest request
    ) {
        return proceed(RepoGetRecordResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(ATProtocolTypes.RepoGetRecord)
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<RepoListRecordsResponse> listRecords(
            RepoListRecordsRequest request
    ) {
        return proceed(RepoListRecordsResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(ATProtocolTypes.RepoListRecords)
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public void putRecord() {

    }

    @Override
    public Response<RepoUploadBlobResponse> uploadBlob(
            RepoUploadBlobRequest request
    ) {
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
