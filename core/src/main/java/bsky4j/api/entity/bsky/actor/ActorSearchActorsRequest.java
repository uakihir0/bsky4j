package bsky4j.api.entity.bsky.actor;

import bsky4j.api.entity.share.AuthRequest;
import bsky4j.api.entity.share.MapRequest;

import java.util.HashMap;
import java.util.Map;

public class ActorSearchActorsRequest extends AuthRequest implements MapRequest {

    protected ActorSearchActorsRequest(String accessJwt) {
        super(accessJwt);
    }

    private String term;
    private Integer limit;
    private String cursor;

    @Override
    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<>();
        addParam(map, "term", getTerm());
        addParam(map, "limit", getLimit());
        addParam(map, "cursor", getCursor());
        return map;
    }

    // region
    public static ActorSearchActorsRequestBuilder builder() {
        return new ActorSearchActorsRequestBuilder();
    }


    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public static final class ActorSearchActorsRequestBuilder {
        private String term;
        private Integer limit;
        private String cursor;
        private String accessJwt;

        private ActorSearchActorsRequestBuilder() {
        }

        public ActorSearchActorsRequestBuilder term(String term) {
            this.term = term;
            return this;
        }

        public ActorSearchActorsRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public ActorSearchActorsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ActorSearchActorsRequestBuilder accessJwt(String accessJwt) {
            this.accessJwt = accessJwt;
            return this;
        }

        public ActorSearchActorsRequest build() {
            ActorSearchActorsRequest actorSearchActorsRequest = new ActorSearchActorsRequest(accessJwt);
            actorSearchActorsRequest.cursor = this.cursor;
            actorSearchActorsRequest.limit = this.limit;
            actorSearchActorsRequest.term = this.term;
            return actorSearchActorsRequest;
        }
    }
    // endregion
}
