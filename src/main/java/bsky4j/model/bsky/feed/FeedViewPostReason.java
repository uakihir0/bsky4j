package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorRefWithInfo;

public interface FeedViewPostReason {

    ActorRefWithInfo getBy();

    String getIndexedAt();
}
