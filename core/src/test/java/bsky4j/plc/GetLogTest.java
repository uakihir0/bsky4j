package bsky4j.plc;

import bsky4j.AbstractTest;
import bsky4j.PLCDirectoryFactory;
import bsky4j.api.entity.share.Response;
import bsky4j.model.plc.DIDLog;
import org.junit.Test;

import java.util.List;

public class GetLogTest extends AbstractTest {

    @Test
    public void testGetLog() {
        String did = "did:plc:bwdof2anluuf5wmfy2upgulw";

        Response<List<DIDLog>> response = PLCDirectoryFactory
                .getInstance().getDIDLogs(did);

        System.out.println(response.get().get(0).getAlsoKnownAs().get(0));
    }
}
