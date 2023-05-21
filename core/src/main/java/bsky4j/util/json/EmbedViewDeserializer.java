package bsky4j.util.json;

import bsky4j.model.bsky.embed.EmbedExternalView;
import bsky4j.model.bsky.embed.EmbedImagesView;
import bsky4j.model.bsky.embed.EmbedRecordView;
import bsky4j.model.bsky.embed.EmbedRecordWithMediaView;
import bsky4j.model.bsky.embed.EmbedViewUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class EmbedViewDeserializer implements JsonDeserializer<EmbedViewUnion> {

    @Override
    public EmbedViewUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(EmbedImagesView.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedImagesView>() {
                }.getType());
            }

            if (type.getAsString().equals(EmbedExternalView.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedExternalView>() {
                }.getType());
            }

            if (type.getAsString().equals(EmbedRecordView.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordView>() {
                }.getType());
            }

            if (type.getAsString().equals(EmbedRecordWithMediaView.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordWithMediaView>() {
                }.getType());
            }
        }
        return null;
    }
}
