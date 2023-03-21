package bsky4j.util;

import bsky4j.model.bsky.feed.FeedPostMain;
import bsky4j.model.bsky.feed.FeedRecordUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class FeedRecordDeserializer implements JsonDeserializer<FeedRecordUnion> {
    @Override
    public FeedRecordUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals("app.bsky.feed.post")) {
                return context.deserialize(obj, new TypeToken<FeedPostMain>() {
                }.getType());
            }
        }
        return null;
    }
}
