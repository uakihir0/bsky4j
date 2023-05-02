package bsky4j.util.json;

import bsky4j.model.bsky.actor.ActorProfile;
import bsky4j.model.bsky.feed.FeedLike;
import bsky4j.model.bsky.feed.FeedPost;
import bsky4j.model.bsky.feed.FeedRepost;
import bsky4j.model.bsky.graph.GraphBlock;
import bsky4j.model.bsky.graph.GraphFollow;
import bsky4j.model.share.RecordUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class RecordDeserializer implements JsonDeserializer<RecordUnion> {

    @Override
    public RecordUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(ActorProfile.TYPE)) {
                return context.deserialize(obj, new TypeToken<ActorProfile>() {
                }.getType());
            }
            if (type.getAsString().equals(FeedPost.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedPost>() {
                }.getType());
            }
            if (type.getAsString().equals(FeedLike.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedLike>() {
                }.getType());
            }
            if (type.getAsString().equals(FeedRepost.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedRepost>() {
                }.getType());
            }
            if (type.getAsString().equals(GraphFollow.TYPE)) {
                return context.deserialize(obj, new TypeToken<GraphFollow>() {
                }.getType());
            }
            if (type.getAsString().equals(GraphBlock.TYPE)) {
                return context.deserialize(obj, new TypeToken<GraphBlock>() {
                }.getType());
            }
        }
        return null;
    }
}
