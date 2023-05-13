package bsky4j.plc;

import bsky4j.AbstractTest;
import bsky4j.PLCDirectoryFactory;
import bsky4j.api.entity.share.Response;
import bsky4j.model.plc.DIDDetails;
import org.junit.Test;

public class GetDetailsTest extends AbstractTest {

    @Test
    public void testGetDetails() {
        String did = "did:plc:bwdof2anluuf5wmfy2upgulw";

        Response<DIDDetails> response = PLCDirectoryFactory
                .getInstance().getDIDDetails(did);

        System.out.println(response.get().getAlsoKnownAs().get(0));
    }
}
