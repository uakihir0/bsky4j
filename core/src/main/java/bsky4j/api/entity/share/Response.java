package bsky4j.api.entity.share;

import javax.annotation.Nullable;

/**
 * @author uakihir0
 */
public class Response<T> {

    private T object;

    public T get() {
        return object;
    }

    @Nullable
    private String json;

    @Nullable
    public String getJson() {
        return json;
    }

    public void set(T object) {
        this.object = object;
    }

    public void setJson(@Nullable String json) {
        this.json = json;
    }
}
