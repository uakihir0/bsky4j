package bsky4j.api.entity.bsky.undoc;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class UndocGetPopularRequest extends AuthRequest implements MapRequest {

    protected UndocGetPopularRequest(String accessJwt) {
        super(accessJwt);
    }

    @Nullable
    private Integer limit;
    @Nullable
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static UndocGetPopularRequestBuilder builder() {
        return new UndocGetPopularRequestBuilder();
    }

    @Nullable
    public Integer getLimit() {
        return limit;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public static final class UndocGetPopularRequestBuilder {
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private UndocGetPopularRequestBuilder() {
        }

        public UndocGetPopularRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public UndocGetPopularRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public UndocGetPopularRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public UndocGetPopularRequest build() {
            UndocGetPopularRequest undocGetPopularRequest = new UndocGetPopularRequest(accessJwt);
            undocGetPopularRequest.limit = this.limit;
            undocGetPopularRequest.cursor = this.cursor;
            return undocGetPopularRequest;
        }
    }
    // endregion
}
