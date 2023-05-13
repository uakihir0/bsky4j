package bsky4j;

import bsky4j.internal._PLCDirectory;

public class PLCDirectoryFactory {

    public static PLCDirectory getInstance() {
        return new _PLCDirectory("https://plc.directory/");
    }

    public static PLCDirectory getInstance(String uri) {
        return new _PLCDirectory(uri);
    }
}
