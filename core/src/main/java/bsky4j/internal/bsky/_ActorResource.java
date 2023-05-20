package bsky4j.internal.bsky;

import bsky4j.BlueskyTypes;
import bsky4j.api.bsky.ActorResource;
import bsky4j.api.entity.bsky.actor.ActorGetProfileRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfileResponse;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesResponse;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsRequest;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsResponse;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;
import static bsky4j.internal.share._InternalUtility.xrpc;

public class _ActorResource implements ActorResource {

    private final String uri;

    public _ActorResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<ActorSearchActorsResponse> searchActors(
            ActorSearchActorsRequest request
    ) {
        return proceed(ActorSearchActorsResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.ActorSearchActors)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<ActorGetProfileResponse> getProfile(
            ActorGetProfileRequest request
    ) {
        return proceed(ActorGetProfileResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.ActorGetProfile)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public Response<ActorGetProfilesResponse> getProfiles(
            ActorGetProfilesRequest request
    ) {
        return proceed(ActorGetProfilesResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(xrpc(this.uri))
                            .path(BlueskyTypes.ActorGetProfiles)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.getActors().forEach((actor) -> {
                builder.param("actors", actor);
            });
            return builder.get();
        });
    }
}
