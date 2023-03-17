package bsky4j.internal.bsky;

import bsky4j.ATProtocolActions;
import bsky4j.BlueskyActions;
import bsky4j.api.bsky.FeedResource;
import bsky4j.api.entity.atproto.session.SessionCreateResponse;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedRequest;
import bsky4j.api.entity.bsky.feed.FeedGetAuthorFeedResponse;
import bsky4j.api.entity.share.Response;
import net.socialhub.http.HttpMediaType;
import net.socialhub.http.HttpRequestBuilder;

import static bsky4j.internal.share._InternalUtility.proceed;

public class _FeedResource implements FeedResource {

    private final String uri;

    _FeedResource(String uri) {
        this.uri = uri;
    }

    @Override
    public Response<FeedGetAuthorFeedResponse> getAuthorFeed(FeedGetAuthorFeedRequest request) {
        return proceed(FeedGetAuthorFeedResponse.class, () -> {

            HttpRequestBuilder builder =
                    new HttpRequestBuilder()
                            .target(this.uri)
                            .path(BlueskyActions.FeedGetAuthorFeed)
                            .header("Authorization", request.getBearerToken())
                            .request(HttpMediaType.APPLICATION_JSON);

            request.toJsonMap().forEach(builder::param);
            return builder.get();
        });
    }

    @Override
    public void getPostThread() {

    }

    @Override
    public void getRepostedBy() {

    }

    @Override
    public void getTimeline() {

    }

    @Override
    public void getVotes() {

    }

    @Override
    public void post() {

    }

    @Override
    public void repost() {

    }

    @Override
    public void setVote() {

    }

    @Override
    public void trend() {

    }

    @Override
    public void vote() {

    }
}
