package bsky4j.util.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import bsky4j.BlueskyTypes;
import bsky4j.model.bsky.richtext.RichtextFacetFeatureUnion;
import bsky4j.model.bsky.richtext.RichtextFacetLink;
import bsky4j.model.bsky.richtext.RichtextFacetMention;
import bsky4j.model.bsky.richtext.RichtextFacetTag;

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
            if (type.getAsString().equals(BlueskyTypes.RichtextFacet + "#link")) {
                return context.deserialize(obj, new TypeToken<RichtextFacetLink>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.RichtextFacet + "#mention")) {
                return context.deserialize(obj, new TypeToken<RichtextFacetMention>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.RichtextFacet + "#tag")) {
                return context.deserialize(obj, new TypeToken<RichtextFacetTag>() {
                }.getType());
            }
        }
        return null;
    }
}

