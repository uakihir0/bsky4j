package bsky4j.util.json;

import bsky4j.model.bsky.richtext.RichtextFacetFeatureUnion;
import bsky4j.model.bsky.richtext.RichtextFacetLink;
import bsky4j.model.bsky.richtext.RichtextFacetMention;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class RichtextFacetFeatureSerializer implements JsonSerializer<RichtextFacetFeatureUnion> {

    @Override
    public JsonElement serialize(
            RichtextFacetFeatureUnion src,
            Type typeOfSrc,
            JsonSerializationContext context
    ) {
        if (src instanceof RichtextFacetLink) {
            return context.serialize(src, RichtextFacetLink.class);
        }
        if (src instanceof RichtextFacetMention) {
            return context.serialize(src, RichtextFacetMention.class);
        }
        return null;
    }
}