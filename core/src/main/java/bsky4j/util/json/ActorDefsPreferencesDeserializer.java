package bsky4j.util.json;


import bsky4j.model.bsky.actor.ActorDefsAdultContentPref;
import bsky4j.model.bsky.actor.ActorDefsContentLabelPref;
import bsky4j.model.bsky.actor.ActorDefsPreferencesUnion;
import bsky4j.model.bsky.actor.ActorDefsSavedFeedsPref;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * @see ActorDefsPreferencesUnion
 */
public class ActorDefsPreferencesDeserializer implements JsonDeserializer<ActorDefsPreferencesUnion> {

    @Override
    public ActorDefsPreferencesUnion deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(ActorDefsAdultContentPref.TYPE)) {
                return context.deserialize(obj, new TypeToken<ActorDefsAdultContentPref>() {
                }.getType());
            }

            if (type.getAsString().equals(ActorDefsContentLabelPref.TYPE)) {
                return context.deserialize(obj, new TypeToken<ActorDefsContentLabelPref>() {
                }.getType());
            }

            if (type.getAsString().equals(ActorDefsSavedFeedsPref.TYPE)) {
                return context.deserialize(obj, new TypeToken<ActorDefsSavedFeedsPref>() {
                }.getType());
            }
        }
        return null;
    }
}
