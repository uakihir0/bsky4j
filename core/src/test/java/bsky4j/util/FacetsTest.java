package bsky4j.util;

import bsky4j.util.facet.FacetList;
import bsky4j.util.facet.FacetRecord;
import bsky4j.util.facet.FacetUtil;
import org.junit.Test;

public class FacetsTest {

    @Test
    public void testExtractFacets() {

        print(FacetUtil.extractFacets("@uakihir0.com テスト"));
        System.out.println(">");
        print(FacetUtil.extractFacets("@uakihir0.com テスト https://www.uakihir0.com/blog/p/202305-mario-movie/"));
    }

    private void print(FacetList records) {
        for (FacetRecord record : records.getRecords()) {
            System.out.println("TYPE: " + record.getType());
            System.out.println("CTEXT: " + record.getContentText());
            System.out.println("DTEXT: " + record.getDisplayText());
        }
    }
}
