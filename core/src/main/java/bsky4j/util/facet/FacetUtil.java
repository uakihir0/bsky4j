package bsky4j.util.facet;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FacetUtil {

    /**
     * Expand the string and expand the elements that can be Facets
     * 文字列を展開して Facets になりえる要素を展開します
     * (公式 Web App を準拠した形で作成しています)
     * (リンクカード等は生成しません)
     */
    public static FacetList extractFacets(String text) {
        List<FacetRecord> records = new ArrayList<>();
        String str = text;

        // メンションの要素を分解
        Pattern mention = Pattern.compile("(?<=^|\\s)(@[\\w.]+)");
        // リンクの要素を展開
        Pattern link = Pattern.compile("(?<=^|\\s)(https?://\\S+)");

        while (true) {
            Matcher mentionMatcher = mention.matcher(str);
            Matcher linkMatcher = link.matcher(str);

            boolean mentionFind = mentionMatcher.find();
            boolean linkFind = linkMatcher.find();

            // どちらも発見できなかった場合は終了
            if (!mentionFind && !linkFind) {
                records.add(new FacetRecord(FacetType.Text, str, str));
                break;
            }

            // 前の方で発見したものから順次処理を実行

            int start = -1;
            int end = -1;
            FacetType type = null;

            if (mentionFind) {
                start = mentionMatcher.start();
                end = mentionMatcher.end();
                type = FacetType.Mention;
            }

            if (linkFind) {
                if (start < 0 || linkMatcher.start() < start) {
                    start = linkMatcher.start();
                    end = linkMatcher.end();
                    type = FacetType.Link;
                }
            }

            // 前後の文字列を切り出す
            String before = str.substring(0, start);
            str = str.substring(end);

            // 前の部分について Text として登録
            if (!before.isEmpty()) {
                records.add(new FacetRecord(FacetType.Text, before, before));
            }

            switch (type) {
                case Mention:
                    records.add(mentionFacet(mentionMatcher.group()));
                    break;
                case Link:
                    records.add(linkFacet(linkMatcher.group()));
                    break;
            }

            if (str.isEmpty()) {
                break;
            }
        }

        return new FacetList(records);
    }

    static FacetRecord mentionFacet(String mention) {
        return new FacetRecord(FacetType.Mention, mention, mention);
    }

    static FacetRecord linkFacet(String link) {

        // プロトコルの部分のみ削除
        String display = link.replaceAll("(https?://)", "");

        // 文字列長さが 30 を超えた場合は省略
        if (display.length() > 30) {
            display = display.substring(0, 27) + "...";
        }

        return new FacetRecord(FacetType.Link, link, display);
    }
}
