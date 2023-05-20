package bsky4j.util.facet;

import bsky4j.model.bsky.richtext.RichtextFacet;
import bsky4j.model.bsky.richtext.RichtextFacetByteSlice;
import bsky4j.model.bsky.richtext.RichtextFacetLink;
import bsky4j.model.bsky.richtext.RichtextFacetMention;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FacetList {

    private final List<FacetRecord> records;

    public FacetList(List<FacetRecord> records) {
        this.records = records;
    }

    public String getDisplayText() {
        return records.stream()
                .map(FacetRecord::getDisplayText)
                .collect(Collectors.joining(""));
    }

    /**
     * RichtextFacet のリストに変換
     * Convert to RichtextFacet List
     */
    public List<RichtextFacet> getRichTextFacets(
            Map<String, String> handleToDidMap
    ) {
        int bytes = 0;
        List<RichtextFacet> facets = new ArrayList<>();
        Function<String, Integer> byteCount = (str) ->
                str.getBytes(StandardCharsets.UTF_8).length;

        for (FacetRecord record : records) {

            switch (record.getType()) {
                case Text: {
                    bytes += byteCount.apply(record.getDisplayText());
                    break;
                }

                case Mention:

                    // DID が設定されている場合はリンクとして Facet を準備
                    if (handleToDidMap.containsKey(record.getDisplayText())) {
                        RichtextFacetByteSlice slice = new RichtextFacetByteSlice();

                        slice.setByteStart(bytes);
                        bytes += byteCount.apply(record.getDisplayText());
                        slice.setByteEnd(bytes);

                        RichtextFacet facet = new RichtextFacet();
                        facet.setFeatures(new ArrayList<>());
                        facet.setIndex(slice);

                        RichtextFacetMention mention = new RichtextFacetMention();
                        mention.setDid(handleToDidMap.get(record.getDisplayText()));
                        facet.getFeatures().add(mention);
                        facets.add(facet);

                    } else {
                        // DID が設定されていない場合は単純なテキストとして表示
                        bytes += byteCount.apply(record.getDisplayText());
                    }
                    break;

                case Link: {
                    RichtextFacetByteSlice slice = new RichtextFacetByteSlice();

                    slice.setByteStart(bytes);
                    bytes += byteCount.apply(record.getDisplayText());
                    slice.setByteEnd(bytes);

                    RichtextFacet facet = new RichtextFacet();
                    facet.setFeatures(new ArrayList<>());
                    facet.setIndex(slice);

                    RichtextFacetLink mention = new RichtextFacetLink();
                    mention.setUri(record.getContentText());
                    facet.getFeatures().add(mention);

                    facets.add(facet);
                    break;
                }
            }
        }

        return facets;
    }

    public List<FacetRecord> getRecords() {
        return records;
    }
}
