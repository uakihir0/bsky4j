package bsky4j.api.entity.bsky.undoc;

import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class UndocSearchFeedsRequest implements MapRequest {

    private String q;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "q", getQ());
        return map;
    }

    // region
    public static UndocSearchFeedsRequestBuilder builder() {
        return new UndocSearchFeedsRequestBuilder();
    }

    public String getQ() {
        return q;
    }

    public static final class UndocSearchFeedsRequestBuilder {
        private String q;

        private UndocSearchFeedsRequestBuilder() {
        }


        public UndocSearchFeedsRequestBuilder q(String q) {
            this.q = q;
            return this;
        }

        public UndocSearchFeedsRequest build() {
            UndocSearchFeedsRequest undocSearchFeedsRequest = new UndocSearchFeedsRequest();
            undocSearchFeedsRequest.q = this.q;
            return undocSearchFeedsRequest;
        }
    }
    // endregion
}
