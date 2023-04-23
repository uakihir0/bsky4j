package bsky4j.util;

import net.socialhub.http.HttpClientConfiguration.HttpClientDefaultConfiguration;
import net.socialhub.http.HttpMediaType;

public class Bsky4JClientConfiguration extends HttpClientDefaultConfiguration {

    @Override
    public String[] getRawContentTypes() {
        return new String[]{
                HttpMediaType.APPLICATION_JSON,
                HttpMediaType.IMAGE_JPEG,
                HttpMediaType.IMAGE_PNG,
                HttpMediaType.IMAGE_GIF,
        };
    }
}
