package bsky4j.util;

import bsky4j.model.bsky.feed.FeedViewPostReasonRepost;
import bsky4j.model.bsky.feed.FeedViewPostReasonTrend;
import bsky4j.model.bsky.feed.FeedViewPostReasonUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class FeedViewPostReasonDeserializer implements JsonDeserializer<FeedViewPostReasonUnion> {

    @Override
    public FeedViewPostReasonUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals("app.bsky.feed.feedViewPost#reasonRepost")) {
                return context.deserialize(obj, new TypeToken<FeedViewPostReasonRepost>() {
                }.getType());
            }

            if (type.getAsString().equals("app.bsky.feed.feedViewPost#reasonTrend")) {
                return context.deserialize(obj, new TypeToken<FeedViewPostReasonTrend>() {
                }.getType());
            }
        }
        return null;
    }
}
