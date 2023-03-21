package bsky4j.model.bsky.feed;

import bsky4j.model.bsky.actor.ActorRefWithInfo;

public interface FeedViewPostReasonUnion {

    String getType();
    ActorRefWithInfo getBy();
    String getIndexedAt();
}
