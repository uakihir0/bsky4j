package bsky4j.api.bsky;

import bsky4j.api.entity.bsky.graph.GraphBlockRequest;
import bsky4j.api.entity.bsky.graph.GraphBlockResponse;
import bsky4j.api.entity.bsky.graph.GraphDeleteBlockRequest;
import bsky4j.api.entity.bsky.graph.GraphDeleteFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowRequest;
import bsky4j.api.entity.bsky.graph.GraphFollowResponse;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksRequest;
import bsky4j.api.entity.bsky.graph.GraphGetBlocksResponse;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowersResponse;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsRequest;
import bsky4j.api.entity.bsky.graph.GraphGetFollowsResponse;
import bsky4j.api.entity.bsky.graph.GraphGetMutesRequest;
import bsky4j.api.entity.bsky.graph.GraphGetMutesResponse;
import bsky4j.api.entity.bsky.graph.GraphMuteActorRequest;
import bsky4j.api.entity.bsky.graph.GraphUnmuteActorRequest;
import bsky4j.api.entity.share.Response;

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

    /**
     * Who is following an actor?
     */
    Response<GraphGetFollowersResponse> getFollowers(GraphGetFollowersRequest request);

    /**
     * Who is an actor following?
     */
    Response<GraphGetFollowsResponse> getFollows(GraphGetFollowsRequest request);

    /**
     * Who does the viewer mute?
     */
    Response<GraphGetMutesResponse> getMutes(GraphGetMutesRequest request);

    /**
     * Mute an actor by did or handle.
     */
    Response<Void> muteActor(GraphMuteActorRequest request);

    /**
     * Unmute an actor by did or handle.
     */
    Response<Void> unmuteActor(GraphUnmuteActorRequest request);

    /**
     * Block operation.
     * (ATProtocol/Repo createRecord wrapper)
     */
    Response<GraphBlockResponse> block(GraphBlockRequest request);

    /**
     * Delete Block operation.
     * (ATProtocol/Repo deleteRecord wrapper)
     */
    Response<Void> deleteBlock(GraphDeleteBlockRequest request);

    /**
     * Who does the viewer mute?
     */
    Response<GraphGetBlocksResponse> getBlocks(GraphGetBlocksRequest request);
}
