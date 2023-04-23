package bsky4j.stream.util;

import bsky4j.stream.util.callback.ClosedCallback;
import bsky4j.stream.util.callback.ErrorCallback;
import bsky4j.stream.util.callback.EventCallback;
import bsky4j.stream.util.callback.OpenedCallback;
import net.socialhub.logger.Logger;

import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

public class StreamClient implements WebSocketListener {

    private static final Logger logger = Logger.getLogger(StreamClient.class);

    private final Timer timer = new Timer(false);

    private WebSocketClient client;
    private boolean isOpen = false;

    private EventCallback eventCallback;
    private OpenedCallback openedCallback;
    private ClosedCallback closedCallback;
    private ErrorCallback errorCallback;

    public StreamClient(String uri) {

        try {
            client = new WebSocketClient(new URI(uri), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void connect() {
        client.connect();
    }

    public void close() {
        client.disconnect();
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void onConnect() {
        logger.debug("Opened connection.");
        this.isOpen = true;

        if (openedCallback != null) {
            openedCallback.onOpened();
        }

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (!isOpen) {
                    timer.cancel();
                    return;
                }
                System.out.println("send ping");
                client.sendPing();
            }
        };

        timer.schedule(task, 10, 10000);
    }

    @Override
    public void onMessage(String message) {
        logger.debug(message);
    }

    @Override
    public void onMessage(byte[] data) {
        logger.debug(new String(data));
    }

    @Override
    public void onDisconnect(int code, String reason) {
        logger.debug("Connection closed, code: " + code + " reason: " + reason);
        this.isOpen = false;

        if (closedCallback != null) {
            closedCallback.onClosed(false);
        }
    }

    @Override
    public void onError(Exception error) {
        if (error != null) {
            logger.debug("Exception: " + error.getClass().getName()
                    + " message: " + error.getMessage());
            logger.debug("Trace: ", error);
        }

        if (errorCallback != null) {
            errorCallback.onError(error);
        }
    }
}
