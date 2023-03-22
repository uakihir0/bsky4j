package bsky4j.util;

import bsky4j.model.bsky.embed.EmbedExternalPresented;
import bsky4j.model.bsky.embed.EmbedPresentedUnion;
import bsky4j.model.bsky.embed.EmbedImagesPresented;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class EmbedPresentedDeserializer implements JsonDeserializer<EmbedPresentedUnion> {

    @Override
    public EmbedPresentedUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals("app.bsky.embed.images#presented")) {
                return context.deserialize(obj, new TypeToken<EmbedImagesPresented>() {
                }.getType());
            }

            if (type.getAsString().equals("app.bsky.embed.external#presented")) {
                return context.deserialize(obj, new TypeToken<EmbedExternalPresented>() {
                }.getType());
            }
        }
        return null;
    }
}
