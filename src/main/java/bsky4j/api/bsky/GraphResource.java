package bsky4j.api.bsky;

import bsky4j.api.entity.share.Response;
import bsky4j.api.entity.bsky.graph.GraphDeleteFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowResponse;

/**
 * Bluesky/Graph
 * <a href="https://atproto.com/lexicons/app-bsky-graph">Reference</a>
 */
public interface GraphResource {

    /**
     * Follow operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<GraphFollowResponse> follow(GraphFollowRequest request);

    /**
     * Delete Follow operation.
     * (ATProtocol/Repo deleteRecord wrapper)
     */
    Response<Void> deleteFollow(GraphDeleteFollowRequest request);

}
