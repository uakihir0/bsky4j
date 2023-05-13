package bsky4j.internal;

import bsky4j.PLCDirectory;
import bsky4j.api.entity.share.Response;
import bsky4j.model.plc.DIDDetails;
import bsky4j.model.plc.DIDLog;
import com.google.gson.reflect.TypeToken;
import net.socialhub.http.HttpRequestBuilder;

import java.util.List;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _PLCDirectory implements PLCDirectory {

    private final String uri;

    public _PLCDirectory(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<DIDDetails> getDIDDetails(String did) {
        return proceed(DIDDetails.class, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(did)
                    .get();
        });
    }

    @Override
    public Response<List<DIDLog>> getDIDLogs(String did) {
        return proceed(new TypeToken<List<DIDLog>>() {
        }, () -> {
            return new HttpRequestBuilder()
                    .target(this.uri)
                    .path(did + "/log")
                    .get();
        });
    }
}
