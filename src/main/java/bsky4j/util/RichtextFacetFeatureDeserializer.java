package bsky4j.util;

import bsky4j.model.bsky.richtext.RichtextFacetFeatureUnion;
import bsky4j.model.bsky.richtext.RichtextFacetLink;
import bsky4j.model.bsky.richtext.RichtextFacetMention;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class RichtextFacetFeatureDeserializer implements JsonDeserializer<RichtextFacetFeatureUnion> {

    @Override
    public RichtextFacetFeatureUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(RichtextFacetLink.TYPE)) {
                return context.deserialize(obj, new TypeToken<RichtextFacetLink>() {
                }.getType());
            }

            if (type.getAsString().equals(RichtextFacetMention.TYPE)) {
                return context.deserialize(obj, new TypeToken<RichtextFacetMention>() {
                }.getType());
            }
        }
        return null;
    }
}

