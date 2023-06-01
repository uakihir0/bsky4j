package bsky4j.bsky.actor;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.actor.ActorGetPreferencesRequest;
import bsky4j.api.entity.bsky.actor.ActorGetPreferencesResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import bsky4j.model.bsky.actor.ActorDefsSavedFeedsPref;
import org.junit.Test;

public class GetPreferencesTest extends AbstractTest {

    @Test
    public void testGetPreferences() {

        Response<ActorGetPreferencesResponse> setting = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .actor().getPreferences(
                        ActorGetPreferencesRequest.builder()
                                .accessJwt(accessJwt)
                                .build()
                );

        setting.get().getPreferences().forEach(s -> {
            if (s instanceof ActorDefsSavedFeedsPref) {
                ((ActorDefsSavedFeedsPref) s).getSaved()
                        .forEach(System.out::println);
            }
        });
    }
}
