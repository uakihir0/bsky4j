package bsky4j.atproto.repo;

import bsky4j.ATProtocolFactory;
import bsky4j.AbstractTest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobRequest;
import bsky4j.api.entity.atproto.repo.RepoUploadBlobResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

import java.io.InputStream;

public class UploadBlobTest extends AbstractTest {

    @Test
    public void testUploadBlob() {
        InputStream stream = getClass().getResourceAsStream("/image/icon.png");

        Response<RepoUploadBlobResponse> response = ATProtocolFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .repo().uploadBlob(
                        RepoUploadBlobRequest.fromStreamBuilder()
                                .accessJwt(accessJwt)
                                .stream(stream)
                                .name("icon.png")
                                .build()
                );

        System.out.println(response.get().getBlob());
    }
}
