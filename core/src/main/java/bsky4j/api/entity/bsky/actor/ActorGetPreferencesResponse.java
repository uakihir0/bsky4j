package bsky4j.api.entity.bsky.actor;

import bsky4j.model.bsky.actor.ActorDefsPreferencesUnion;

import java.util.List;

public class ActorGetPreferencesResponse {

    private List<ActorDefsPreferencesUnion> preferences;

    // region
    public List<ActorDefsPreferencesUnion> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<ActorDefsPreferencesUnion> preferences) {
        this.preferences = preferences;
    }
    // endregion
}
