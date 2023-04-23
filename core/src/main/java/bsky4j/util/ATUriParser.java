package bsky4j.util;

/**
 * ATProtocol URI
 * at://{did}/{recordType}/{key}
 */
public class ATUriParser {

    /**
     * Parse the URI of the record to get the DID.
     */
    public static String getDid(String uri) {
        return uri.split("://")[1]
                .split("/")[0];
    }

    /**
     * Parse the URI of the record to get the RecordType.
     */
    public static String getRecordType(String uri) {
        return uri.split("://")[1]
                .split("/")[1];
    }

    /**
     * Parse the URI of the record to get the rkey.
     */
    public static String getRKey(String uri) {
        return uri.split("://")[1]
                .split("/")[2];
    }
}
