package bsky4j.api.entity.share;

import bsky4j.internal.share._InternalUtility;
import com.google.gson.reflect.TypeToken;

import java.util.Base64;
import java.util.Map;

public class AuthRequest {

    private final String accessJwt;

    protected AuthRequest(String accessJwt) {
        this.accessJwt = accessJwt;
    }

    public String getAccessJwt() {
        return accessJwt;
    }

    public String getBearerToken() {
        return "Bearer " + getAccessJwt();
    }

    public String getDid() {
        String encodedJson = getAccessJwt().split("\\.")[1];
        String decodedJson = new String(Base64.getDecoder().decode(encodedJson));
        Map<String, String> jsonMap = _InternalUtility.gson.fromJson(decodedJson,
                new TypeToken<Map<String, String>>() {
                }.getType());
        return jsonMap.get("sub");
    }
}
