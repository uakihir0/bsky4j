package bsky4j.entity.share;

/**
 * @author uakihir0
 */
public class Response<T> {

    private T object;

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }
}
