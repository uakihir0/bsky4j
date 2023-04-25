package bsky4j.stream.atproto.sync;

import bsky4j.domain.Service;
import bsky4j.model.bsky.feed.FeedPost;
import bsky4j.stream.ATProtocolStreamFactory;
import bsky4j.stream.AbstractTest;
import bsky4j.stream.api.entity.atproto.sync.SyncSubscribeReposRequest;
import bsky4j.stream.util.StreamClient;
import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;
import com.google.gson.GsonBuilder;
import net.socialhub.logger.Logger;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SubscribeRepoTest extends AbstractTest {

    @Test
    public void testSubscribeRepo() {
        Logger.getLogger(null).setLogLevel(Logger.LogLevel.WARN);

        LanguageDetector detector = LanguageDetectorBuilder
                .fromLanguages(
                        Language.ENGLISH,
                        Language.JAPANESE,
                        Language.KOREAN,
                        Language.CHINESE,
                        Language.GERMAN,
                        Language.FRENCH,
                        Language.ITALIAN,
                        Language.SPANISH,
                        Language.PORTUGUESE,
                        Language.ALBANIAN,
                        Language.ARABIC
                )
                .build();
        Map<Language, AtomicInteger> map = new ConcurrentHashMap<>();

        try {
            StreamClient stream = ATProtocolStreamFactory
                    .getInstance(Service.BSKY_SOCIAL.getUri())
                    .sync().subscribeRepos(
                            SyncSubscribeReposRequest
                                    .builder()
                                    .build()
                    );

            stream.setEventCallback((cid, url, record) -> {

                if (record instanceof FeedPost) {
                    FeedPost feedMain = (FeedPost) record;
                    System.out.println("TEXT> " + feedMain.getText());
                    Language language = detector.detectLanguageOf(feedMain.getText());
                    System.out.println("LANG> " + language);

                    map.computeIfAbsent(language,
                            (k) -> new AtomicInteger(0)
                    ).incrementAndGet();
                }
            });

            stream.connect();
            Thread.sleep(60000 * 10);

            saveFile(new GsonBuilder()
                            .setPrettyPrinting()
                            .create().toJson(map),
                    "lang.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
