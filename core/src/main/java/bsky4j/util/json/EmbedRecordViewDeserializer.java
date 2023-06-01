package bsky4j.util.json;

import bsky4j.model.bsky.embed.EmbedRecordViewBlocked;
import bsky4j.model.bsky.embed.EmbedRecordViewNotFound;
import bsky4j.model.bsky.embed.EmbedRecordViewRecord;
import bsky4j.model.bsky.embed.EmbedRecordViewUnion;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class EmbedRecordViewDeserializer implements JsonDeserializer<EmbedRecordViewUnion> {

    @Override
    public EmbedRecordViewUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(EmbedRecordViewRecord.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordViewRecord>() {
                }.getType());
            }

            if (type.getAsString().equals(EmbedRecordViewNotFound.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordViewNotFound>() {
                }.getType());
            }

            if (type.getAsString().equals(EmbedRecordViewBlocked.TYPE)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordViewBlocked>() {
                }.getType());
            }
        }
        return null;
    }
}
