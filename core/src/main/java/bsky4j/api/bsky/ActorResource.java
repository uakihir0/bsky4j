package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.actor.ActorGetPreferencesRequest;
import bsky4j.api.entity.bsky.actor.ActorGetPreferencesResponse;
import bsky4j.api.entity.bsky.actor.ActorGetProfileRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfileResponse;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesResponse;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsRequest;
import bsky4j.api.entity.bsky.actor.ActorSearchActorsResponse;
import bsky4j.api.entity.share.Response;

public interface ActorResource {

    /**
     * Find actors matching search criteria.
     */
    Response<ActorSearchActorsResponse> searchActors(ActorSearchActorsRequest request);

    /**
     *
     */
    Response<ActorGetProfileResponse> getProfile(ActorGetProfileRequest request);

    /**
     *
     */
    Response<ActorGetProfilesResponse> getProfiles(ActorGetProfilesRequest request);

    /**
     * Get private preferences attached to the account.
     */
    Response<ActorGetPreferencesResponse> getPreferences(ActorGetPreferencesRequest request);

}
