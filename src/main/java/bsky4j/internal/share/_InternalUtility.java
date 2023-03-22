package bsky4j.internal.share;

import bsky4j.ATProtocolException;
import bsky4j.api.entity.share.Response;
import bsky4j.model.bsky.embed.EmbedPresentedUnion;
import bsky4j.model.bsky.feed.FeedGetPostThreadUnion;
import bsky4j.model.bsky.feed.FeedRecordUnion;
import bsky4j.model.bsky.feed.FeedViewPostReasonUnion;
import bsky4j.util.EmbedPresentedDeserializer;
import bsky4j.util.FeedGetPostThreadDeserializer;
import bsky4j.util.FeedRecordDeserializer;
import bsky4j.util.FeedViewPostReasonDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.socialhub.http.HttpException;
import net.socialhub.http.HttpRequestBuilder;
import net.socialhub.http.HttpResponse;
import net.socialhub.http.HttpResponseCode;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;

/**
 * @author uakihir0
 */
public class _InternalUtility {

    public final static Gson gson = new GsonBuilder()
            .registerTypeAdapter(
                    EmbedPresentedUnion.class,
                    new EmbedPresentedDeserializer())
            .registerTypeAdapter(
                    FeedRecordUnion.class,
                    new FeedRecordDeserializer())
            .registerTypeAdapter(
                    FeedGetPostThreadUnion.class,
                    new FeedGetPostThreadDeserializer())
            .registerTypeAdapter(
                    FeedViewPostReasonUnion.class,
                    new FeedViewPostReasonDeserializer())
            .create();

    public final static SimpleDateFormat dateFormat =
            new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

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
            throw new ATProtocolException(e);
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
            throw new ATProtocolException(e);
        }
    }

    public interface RequestInterface {
        HttpResponse proceed() throws HttpException;
    }

    static void addParam(HttpRequestBuilder builder, String key, Object value) {
        if (value != null) {
            builder.param(key, value.toString());
        }
    }

    static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            return str;
        }
    }
}
