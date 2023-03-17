package bsky4j.api.entity.share;

import bsky4j.internal.share._InternalUtility;

import java.util.Map;

public interface JsonRequest {
    default String toJson() {
        Map<String, Object> map = toJsonMap();
        return _InternalUtility.gson.toJson(map);
    }

    Map<String, Object> toJsonMap();

    default void addParam(Map<String, Object> map, String key, Object value) {
        if (key != null && value != null) {
            map.put(key, value);
        }
    }
}
