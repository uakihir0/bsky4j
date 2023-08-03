package bsky4j.internal.share;

import bsky4j.ATProtocolException;
import bsky4j.api.entity.share.Response;
import bsky4j.model.bsky.actor.ActorDefsPreferencesUnion;
import bsky4j.model.bsky.embed.EmbedRecordViewUnion;
import bsky4j.model.bsky.embed.EmbedUnion;
import bsky4j.model.bsky.embed.EmbedViewUnion;
import bsky4j.model.bsky.feed.FeedDefsThreadUnion;
import bsky4j.model.bsky.richtext.RichtextFacetFeatureUnion;
import bsky4j.model.share.RecordUnion;
import bsky4j.util.json.ActorDefsPreferencesDeserializer;
import bsky4j.util.json.EmbedDeserializer;
import bsky4j.util.json.EmbedRecordViewDeserializer;
import bsky4j.util.json.EmbedSerializer;
import bsky4j.util.json.EmbedViewDeserializer;
import bsky4j.util.json.FeedDefsThreadDeserializer;
import bsky4j.util.json.RecordDeserializer;
import bsky4j.util.json.RichtextFacetFeatureDeserializer;
import bsky4j.util.json.RichtextFacetFeatureSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpResponse;
import net.socialhub.http.HttpResponseCode;

import java.text.SimpleDateFormat;
import java.util.Map;

import static java.util.TimeZone.getTimeZone;

/**
 * @author uakihir0
 */
public class _InternalUtility {

    public final static Gson gson = new GsonBuilder()
            .registerTypeAdapter(
                    EmbedUnion.class,
                    new EmbedDeserializer())
            .registerTypeAdapter(
                    EmbedUnion.class,
                    new EmbedSerializer())
            .registerTypeAdapter(
                    EmbedViewUnion.class,
                    new EmbedViewDeserializer())
            .registerTypeAdapter(
                    RecordUnion.class,
                    new RecordDeserializer())
            .registerTypeAdapter(
                    FeedDefsThreadUnion.class,
                    new FeedDefsThreadDeserializer())
            .registerTypeAdapter(
                    RichtextFacetFeatureUnion.class,
                    new RichtextFacetFeatureDeserializer())
            .registerTypeAdapter(
                    RichtextFacetFeatureUnion.class,
                    new RichtextFacetFeatureSerializer())
            .registerTypeAdapter(
                    EmbedRecordViewUnion.class,
                    new EmbedRecordViewDeserializer())
            .registerTypeAdapter(
                    ActorDefsPreferencesUnion.class,
                    new ActorDefsPreferencesDeserializer())
            .create();

    public final static SimpleDateFormat dateFormat;

    static {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormat.setTimeZone(getTimeZone("UTC"));
    }

    private _InternalUtility() {
    }

    public static Response<Void> proceed(RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                return new Response<>();
            }
            throw new ATProtocolException(null);

        } catch (HttpException e) {
            throw handleError(e);
        }
    }

    public static <T> Response<T> proceed(Class<T> clazz, RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                Response<T> result = new Response<>();
                result.set(gson.fromJson(response.asString(), clazz));
                return result;
            }
            throw new ATProtocolException(null);

        } catch (HttpException e) {
            throw handleError(e);
        }
    }

    public static <T> Response<T> proceed(TypeToken<T> clazz, RequestInterface function) {
        try {
            HttpResponse response = function.proceed();
            if (response.getStatusCode() == HttpResponseCode.OK) {
                Response<T> result = new Response<>();
                result.set(gson.fromJson(response.asString(), clazz.getType()));
                return result;
            }

            throw new ATProtocolException(null);

        } catch (HttpException e) {
            throw handleError(e);
        }
    }

    public interface RequestInterface {
        HttpResponse proceed() throws HttpException;
    }

    public static String xrpc(String uri) {
        StringBuilder builder = new StringBuilder(uri);
        if (!uri.endsWith("/")) {
            builder.append("/");
        }
        builder.append("xrpc/");
        return builder.toString();
    }

    static RuntimeException handleError(HttpException e) {
        try {
            String message = e.getResponse().asString();
            Map<String, Object> error = gson.fromJson(message,
                    new TypeToken<Map<String, Object>>() {
                    }.getType());

            ATProtocolException exception = new ATProtocolException(e);
            exception.setErrorMessage(error.get("message").toString());
            exception.setError(error.get("error").toString());
            return exception;

        } catch (Exception t) {
            return new ATProtocolException(e);
        }
    }
}
