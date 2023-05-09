package bsky4j.bsky.actor;

import bsky4j.AbstractTest;
import bsky4j.BlueskyFactory;
import bsky4j.api.entity.bsky.actor.ActorGetProfileRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfileResponse;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesRequest;
import bsky4j.api.entity.bsky.actor.ActorGetProfilesResponse;
import bsky4j.api.entity.share.Response;
import bsky4j.domain.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetProfilesTest extends AbstractTest {

    @Test
    public void testGetProfiles() {
        List<String> handles = new ArrayList<>();
        handles.add("why.bsky.team");
        handles.add("jay.bsky.team");
        handles.add("uakihir0.com");

        Response<ActorGetProfilesResponse> actors = BlueskyFactory
                .getInstance(Service.BSKY_SOCIAL.getUri())
                .actor().getProfiles(
                        ActorGetProfilesRequest.builder()
                                .accessJwt(accessJwt)
                                .actors(handles)
                                .build()
                );

        actors.get().getProfiles()
                .forEach(this::print);
    }

}
