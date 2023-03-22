package bsky4j.internal.atproto;

import bsky4j.ATProtocolTypes;
import bsky4j.api.atproto.BlobResource;
import bsky4j.api.entity.atproto.blob.BlobUploadByFileRequest;
import bsky4j.api.entity.atproto.blob.BlobUploadByStreamRequest;
import bsky4j.api.entity.atproto.blob.BlobUploadRequest;
import bsky4j.api.entity.atproto.blob.BlobUploadResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.util.Bsky4JClientConfiguration;
import net.socialhub.http.HttpClientConfiguration;
import net.socialhub.http.HttpClientConfiguration.HttpClientDefaultConfiguration;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _BlobResource implements BlobResource {

    private final String uri;

    _BlobResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<BlobUploadResponse> upload(BlobUploadRequest request) {
        return proceed(BlobUploadResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder(new Bsky4JClientConfiguration())
                            .target(this.uri)
                            .path(ATProtocolTypes.BlobUpload);

            // From file
            if (request instanceof BlobUploadByFileRequest) {
                BlobUploadByFileRequest f = (BlobUploadByFileRequest) request;
                builder.header("Authorization", f.getBearerToken());
                builder.file("file", f.getFile());
            }

            // From InputStream
            if (request instanceof BlobUploadByStreamRequest) {
                BlobUploadByStreamRequest s = (BlobUploadByStreamRequest) request;
                builder.header("Authorization", s.getBearerToken());
                builder.file("file", s.getStream(), s.getName());
            }

            return builder.request(HttpMediaType.APPLICATION_JSON).post();
        });
    }
}
