package bsky4j;

import bsky4j.api.entity.share.Response;
import bsky4j.model.plc.DIDDetails;
import bsky4j.model.plc.DIDLog;

import java.util.List;

public interface PLCDirectory {

    Response<DIDDetails> getDIDDetails(String did);

    Response<List<DIDLog>> getDIDLogs(String did);
}
