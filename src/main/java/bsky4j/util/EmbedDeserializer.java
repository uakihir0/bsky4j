package bsky4j.util;

import bsky4j.BlueskyTypes;
import bsky4j.model.bsky.embed.EmbedExternal;
import bsky4j.model.bsky.embed.EmbedImages;
import bsky4j.model.bsky.embed.EmbedUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class EmbedDeserializer implements JsonDeserializer<EmbedUnion> {

    @Override
    public EmbedUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(BlueskyTypes.EmbedImages)) {
                return context.deserialize(obj, new TypeToken<EmbedImages>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.EmbedExternal)) {
                return context.deserialize(obj, new TypeToken<EmbedExternal>() {
                }.getType());
            }
        }
        return null;
    }
}
