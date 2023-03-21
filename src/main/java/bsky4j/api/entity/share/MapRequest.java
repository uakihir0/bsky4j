package bsky4j.api.entity.share;

import bsky4j.internal.share._InternalUtility;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public interface MapRequest {
    default String toJson() {
        Map<String, Object> map = toMap();
        return _InternalUtility.gson.toJson(map);
    }

    Map<String, Object> toMap();

    default void addParam(Map<String, Object> map, String key, Object value) {
        if (key != null && value != null) {

            if (value instanceof String) {
                map.put(key, value);
                return;
            }
            if (value instanceof Integer) {
                map.put(key, value);
                return;
            }

            String json = _InternalUtility.gson.toJson(value);
            map.put(key, _InternalUtility.gson.fromJson(json,
                    new TypeToken<Map<String, Object>>() {
                    }.getType()));
        }
    }
}
