package bsky4j.util;

import bsky4j.model.bsky.feed.FeedGetPostThreadNotFoundPost;
import bsky4j.model.bsky.feed.FeedGetPostThreadUnion;
import bsky4j.model.bsky.feed.FeedGetPostThreadViewPost;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class FeedGetPostThreadDeserializer implements JsonDeserializer<FeedGetPostThreadUnion> {

    @Override
    public FeedGetPostThreadUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals("app.bsky.feed.getPostThread#notFoundPost")) {
                return context.deserialize(obj, new TypeToken<FeedGetPostThreadNotFoundPost>() {
                }.getType());
            }
            if (type.getAsString().equals("app.bsky.feed.getPostThread#threadViewPost")) {
                return context.deserialize(obj, new TypeToken<FeedGetPostThreadViewPost>() {
                }.getType());
            }
        }

        return null;
    }
}
