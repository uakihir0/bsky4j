package bsky4j.util;

import bsky4j.model.bsky.feed.FeedPost;
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
            if (type.getAsString().equals(FeedPost.TYPE)) {
                return context.deserialize(obj, new TypeToken<FeedPost>() {
                }.getType());
            }
        }
        return null;
    }
}
