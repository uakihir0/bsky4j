package bsky4j.util;

import bsky4j.model.bsky.feed.FeedDefsNotFoundPost;
import bsky4j.model.bsky.feed.FeedDefsThreadUnion;
import bsky4j.model.bsky.feed.FeedDefsThreadViewPost;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class FeedDefsThreadDeserializer implements JsonDeserializer<FeedDefsThreadUnion> {

    @Override
    public FeedDefsThreadUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(FeedDefsThreadViewPost.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedDefsThreadViewPost>() {
                }.getType());
            }
            if (type.getAsString().equals(FeedDefsNotFoundPost.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedDefsNotFoundPost>() {
                }.getType());
            }
        }

        return null;
    }
}
